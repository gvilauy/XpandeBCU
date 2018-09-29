/**
 * DatoscotizacionesDato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class DatoscotizacionesDato  implements java.io.Serializable {
    private java.util.Date fecha;

    private short moneda;

    private String nombre;

    private String codigoISO;

    private String emisor;

    private double TCC;

    private double TCV;

    private double arbAct;

    private byte formaArbitrar;

    public DatoscotizacionesDato() {
    }

    public DatoscotizacionesDato(
           java.util.Date fecha,
           short moneda,
           String nombre,
           String codigoISO,
           String emisor,
           double TCC,
           double TCV,
           double arbAct,
           byte formaArbitrar) {
           this.fecha = fecha;
           this.moneda = moneda;
           this.nombre = nombre;
           this.codigoISO = codigoISO;
           this.emisor = emisor;
           this.TCC = TCC;
           this.TCV = TCV;
           this.arbAct = arbAct;
           this.formaArbitrar = formaArbitrar;
    }


    /**
     * Gets the fecha value for this DatoscotizacionesDato.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DatoscotizacionesDato.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the moneda value for this DatoscotizacionesDato.
     * 
     * @return moneda
     */
    public short getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this DatoscotizacionesDato.
     * 
     * @param moneda
     */
    public void setMoneda(short moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the nombre value for this DatoscotizacionesDato.
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DatoscotizacionesDato.
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the codigoISO value for this DatoscotizacionesDato.
     * 
     * @return codigoISO
     */
    public String getCodigoISO() {
        return codigoISO;
    }


    /**
     * Sets the codigoISO value for this DatoscotizacionesDato.
     * 
     * @param codigoISO
     */
    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }


    /**
     * Gets the emisor value for this DatoscotizacionesDato.
     * 
     * @return emisor
     */
    public String getEmisor() {
        return emisor;
    }


    /**
     * Sets the emisor value for this DatoscotizacionesDato.
     * 
     * @param emisor
     */
    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }


    /**
     * Gets the TCC value for this DatoscotizacionesDato.
     * 
     * @return TCC
     */
    public double getTCC() {
        return TCC;
    }


    /**
     * Sets the TCC value for this DatoscotizacionesDato.
     * 
     * @param TCC
     */
    public void setTCC(double TCC) {
        this.TCC = TCC;
    }


    /**
     * Gets the TCV value for this DatoscotizacionesDato.
     * 
     * @return TCV
     */
    public double getTCV() {
        return TCV;
    }


    /**
     * Sets the TCV value for this DatoscotizacionesDato.
     * 
     * @param TCV
     */
    public void setTCV(double TCV) {
        this.TCV = TCV;
    }


    /**
     * Gets the arbAct value for this DatoscotizacionesDato.
     * 
     * @return arbAct
     */
    public double getArbAct() {
        return arbAct;
    }


    /**
     * Sets the arbAct value for this DatoscotizacionesDato.
     * 
     * @param arbAct
     */
    public void setArbAct(double arbAct) {
        this.arbAct = arbAct;
    }


    /**
     * Gets the formaArbitrar value for this DatoscotizacionesDato.
     * 
     * @return formaArbitrar
     */
    public byte getFormaArbitrar() {
        return formaArbitrar;
    }


    /**
     * Sets the formaArbitrar value for this DatoscotizacionesDato.
     * 
     * @param formaArbitrar
     */
    public void setFormaArbitrar(byte formaArbitrar) {
        this.formaArbitrar = formaArbitrar;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DatoscotizacionesDato)) return false;
        DatoscotizacionesDato other = (DatoscotizacionesDato) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            this.moneda == other.getMoneda() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.codigoISO==null && other.getCodigoISO()==null) || 
             (this.codigoISO!=null &&
              this.codigoISO.equals(other.getCodigoISO()))) &&
            ((this.emisor==null && other.getEmisor()==null) || 
             (this.emisor!=null &&
              this.emisor.equals(other.getEmisor()))) &&
            this.TCC == other.getTCC() &&
            this.TCV == other.getTCV() &&
            this.arbAct == other.getArbAct() &&
            this.formaArbitrar == other.getFormaArbitrar();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        _hashCode += getMoneda();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getCodigoISO() != null) {
            _hashCode += getCodigoISO().hashCode();
        }
        if (getEmisor() != null) {
            _hashCode += getEmisor().hashCode();
        }
        _hashCode += new Double(getTCC()).hashCode();
        _hashCode += new Double(getTCV()).hashCode();
        _hashCode += new Double(getArbAct()).hashCode();
        _hashCode += getFormaArbitrar();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatoscotizacionesDato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Cotiza", "datoscotizaciones.dato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoISO");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "CodigoISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisor");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Emisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCC");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "TCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCV");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "TCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arbAct");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "ArbAct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaArbitrar");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "FormaArbitrar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
