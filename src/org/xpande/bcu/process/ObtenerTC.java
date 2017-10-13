package org.xpande.bcu.process;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MClient;
import org.compiere.model.MConversionRate;
import org.compiere.model.X_C_Conversion_Rate;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.TimeUtil;
import org.xpande.bcu.ws.*;
import org.xpande.core.utils.DateUtils;
import org.xpande.financial.model.MZFinancialConfig;
import org.xpande.financial.model.MZFinancialConfigTC;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Proceso para cargar Tasa de Cambio de manera automática mediante WebServices del BCU.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/3/17.
 */
public class ObtenerTC extends SvrProcess {

    private Timestamp startDate = null;
    private Timestamp endDate = null;
    private int cCurrencyID = 0;


    @Override
    protected void prepare() {

        ProcessInfoParameter[] para = getParameter();

        for (int i = 0; i < para.length; i++){

            String name = para[i].getParameterName();

            if (name != null){
                if (para[i].getParameter() != null){
                    if (name.trim().equalsIgnoreCase("DateTrx")){
                        this.startDate = (Timestamp)para[i].getParameter();
                        this.endDate = (Timestamp)para[i].getParameter_To();
                    }
                    else if (name.trim().equalsIgnoreCase("C_Currency_ID")){
                        this.cCurrencyID = ((BigDecimal)para[i].getParameter()).intValueExact();
                    }
                }
            }
        }

    }

    @Override
    protected String doIt() throws Exception {

        try{

            if (this.startDate == null){
                this.startDate = new Timestamp(System.currentTimeMillis());
            }
            if (this.endDate == null){
                this.endDate = new Timestamp(System.currentTimeMillis());
            }

            this.startDate = TimeUtil.trunc(this.startDate, TimeUtil.TRUNC_DAY);
            this.endDate = TimeUtil.trunc(this.endDate, TimeUtil.TRUNC_DAY);

            // Lista de monedas a procesar
            MZFinancialConfig financialConfig = MZFinancialConfig.getDefault(getCtx(), get_TrxName());
            List<MZFinancialConfigTC> configTCS = financialConfig.getConfigTCs();
            if (this.cCurrencyID > 0){
                MZFinancialConfigTC configTC = financialConfig.getConfigTCByCurrency(this.cCurrencyID);
                if ((configTC != null) && (configTC.get_ID() > 0)){
                    configTCS = new ArrayList<MZFinancialConfigTC>();
                    configTCS.add(configTC);
                }
            }

            // Compañia tomada del modelo de configuración financiera
            MClient client = new MClient(getCtx(), financialConfig.getAD_Client_ID(), null);

            // Array de codigos de moneda a procesar
            short[] codigosMoneda = new short[configTCS.size()];
            for (int i = 0 ; i < configTCS.size() ; i++) {
                codigosMoneda[i] = Short.valueOf(configTCS.get(i).getCodigoTC());
            }

            // Modelos Apache para WS
            Wsbcucotizacionesin wsbcucotizacionesin = new Wsbcucotizacionesin();
            WsbcucotizacionesExecute wsbcucotizacionesExecute = new WsbcucotizacionesExecute();
            WsbcucotizacionesSoapPortProxy wsbcucotizacionesSoapPortProxy = new WsbcucotizacionesSoapPortProxy();

            // Parametros WS
            wsbcucotizacionesin.setMoneda(codigosMoneda);
            wsbcucotizacionesin.setFechaDesde(this.startDate);
            wsbcucotizacionesin.setFechaHasta(this.endDate);
            wsbcucotizacionesin.setGrupo((byte) 0);

            // Invocación WS
            wsbcucotizacionesExecute.setEntrada(wsbcucotizacionesin);
            WsbcucotizacionesExecuteResponse wsbcucotizacionesExecuteResponse = wsbcucotizacionesSoapPortProxy.execute(wsbcucotizacionesExecute);

            // Proceso Respuesta WS
            if(wsbcucotizacionesExecuteResponse == null){
                return "@Error@ " + "No se obtuvo respuesta de servicio de Carga de Tasa de Cambio.";
            }

            Wsbcucotizacionesout wsbcucotizacionesout = wsbcucotizacionesExecuteResponse.getSalida();
            if ((wsbcucotizacionesout == null) || (wsbcucotizacionesout.getRespuestastatus() == null)){
                return "@Error@ " + "No se obtuvo salida en respuesta de servicio de Carga de Tasa de Cambio.";
            }

            if (wsbcucotizacionesout.getRespuestastatus().getStatus() != 1) {
                return "@Error@ " + "Errores en servicio de Carga de Tasa de Cambio: " + wsbcucotizacionesout.getRespuestastatus().getMensaje();
            }

            // Proceso salida de Respuesta WS
            DatoscotizacionesDato[] datoscotizaciones = wsbcucotizacionesout.getDatoscotizaciones();
            if ((datoscotizaciones == null) || (datoscotizaciones.length <= 0)) {
                return "@Error@ " + "No se obtuvieron cotizaciones en salida de servicio de Carga de Tasa de Cambio";
            }

            for (int i = 0; i < datoscotizaciones.length; i++){

                DatoscotizacionesDato datoCotiz = datoscotizaciones[i];

                MZFinancialConfigTC configTC = financialConfig.getConfigTCByCurrencyTCCode(String.valueOf(datoCotiz.getMoneda()));
                if (configTC == null){
                    continue;
                }

                Date fechaTasa = DateUtils.addDays(datoCotiz.getFecha(), 1);

                MConversionRate conversionRate = new MConversionRate(getCtx(), 0, get_TrxName());
                conversionRate.set_ValueOfColumn(X_C_Conversion_Rate.COLUMNNAME_AD_Client_ID, financialConfig.getAD_Client_ID());
                conversionRate.setAD_Org_ID(0);
                if (configTC.isCargarTCCompra()){
                    conversionRate.setMultiplyRate(BigDecimal.valueOf(datoCotiz.getTCC()));
                }
                else{
                    conversionRate.setMultiplyRate(BigDecimal.valueOf(datoCotiz.getTCV()));
                }
                conversionRate.setC_ConversionType_ID(114);
                conversionRate.setC_Currency_ID(configTC.getC_Currency_ID());
                conversionRate.setC_Currency_ID_To(client.getC_Currency_ID());
                conversionRate.setValidFrom(new Timestamp(fechaTasa.getTime()));
                conversionRate.setValidTo(new Timestamp(fechaTasa.getTime()));
                conversionRate.saveEx();

            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return "OK";
    }
}
