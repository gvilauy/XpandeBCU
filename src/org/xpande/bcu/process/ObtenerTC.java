package org.xpande.bcu.process;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.TimeUtil;
import org.xpande.bcu.ws.*;
import org.xpande.financial.model.MZFinancialConfig;
import org.xpande.financial.model.MZFinancialConfigTC;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
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
                
            }

            /*
            List<DatoscotizacionesDato> listdatoscotizaciones = Arrays.asList(datos);
            for (DatoscotizacionesDato dato : listdatoscotizaciones) {

                // ==========================================================
                // =  Cargo moneda en ADempiere								=
                // ==========================================================

                MLoadRateLine mLoadRateLine = getMLoadRateLineByCurrencyCode(dato.getMoneda());

                if (MSysConfig.getBooleanValue("UY_WS_Cotiza_monedaCompra", true, this.getAD_Client_ID())) {
                    setMConversionRate((MCurrency) mLoadRateLine.getC_Currency(), BigDecimal.valueOf(dato.getTCC()));
                } else {
                    setMConversionRate((MCurrency) mLoadRateLine.getC_Currency(), BigDecimal.valueOf(dato.getTCV()));
                }
                mLoadRateLines.remove(mLoadRateLine);
            }

            // Recorro las monedas que no fueron obtenidas del web service para cargarlas con la �ltima tasa de cambio
            for (MLoadRateLine line : mLoadRateLines) {
                setMConversionRate((MCurrency) line.getC_Currency(), null);
            }
            */



            for (MZFinancialConfigTC configTC: configTCS){

            }

            // Loop entre Rango de Fechas. Cargo tasa para cada fecha del rango.
            LocalDate start = this.startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate end = this.endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {



            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return "OK";
    }
}
