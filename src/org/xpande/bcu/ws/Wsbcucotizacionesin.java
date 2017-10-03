/**
 * Wsbcucotizacionesin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class Wsbcucotizacionesin  implements java.io.Serializable {
    private short[] moneda;

    private java.util.Date fechaDesde;

    private java.util.Date fechaHasta;

    private byte grupo;

    public Wsbcucotizacionesin() {
    }

    public Wsbcucotizacionesin(
           short[] moneda,
           java.util.Date fechaDesde,
           java.util.Date fechaHasta,
           byte grupo) {
           this.moneda = moneda;
           this.fechaDesde = fechaDesde;
           this.fechaHasta = fechaHasta;
           this.grupo = grupo;
    }


    /**
     * Gets the moneda value for this Wsbcucotizacionesin.
     * 
     * @return moneda
     */
    public short[] getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this Wsbcucotizacionesin.
     * 
     * @param moneda
     */
    public void setMoneda(short[] moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the fechaDesde value for this Wsbcucotizacionesin.
     * 
     * @return fechaDesde
     */
    public java.util.Date getFechaDesde() {
        return fechaDesde;
    }


    /**
     * Sets the fechaDesde value for this Wsbcucotizacionesin.
     * 
     * @param fechaDesde
     */
    public void setFechaDesde(java.util.Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }


    /**
     * Gets the fechaHasta value for this Wsbcucotizacionesin.
     * 
     * @return fechaHasta
     */
    public java.util.Date getFechaHasta() {
        return fechaHasta;
    }


    /**
     * Sets the fechaHasta value for this Wsbcucotizacionesin.
     * 
     * @param fechaHasta
     */
    public void setFechaHasta(java.util.Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


    /**
     * Gets the grupo value for this Wsbcucotizacionesin.
     * 
     * @return grupo
     */
    public byte getGrupo() {
        return grupo;
    }


    /**
     * Sets the grupo value for this Wsbcucotizacionesin.
     * 
     * @param grupo
     */
    public void setGrupo(byte grupo) {
        this.grupo = grupo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Wsbcucotizacionesin)) return false;
        Wsbcucotizacionesin other = (Wsbcucotizacionesin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moneda==null && other.getMoneda()==null) || 
             (this.moneda!=null &&
              java.util.Arrays.equals(this.moneda, other.getMoneda()))) &&
            ((this.fechaDesde==null && other.getFechaDesde()==null) || 
             (this.fechaDesde!=null &&
              this.fechaDesde.equals(other.getFechaDesde()))) &&
            ((this.fechaHasta==null && other.getFechaHasta()==null) || 
             (this.fechaHasta!=null &&
              this.fechaHasta.equals(other.getFechaHasta()))) &&
            this.grupo == other.getGrupo();
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
        if (getMoneda() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMoneda());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMoneda(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechaDesde() != null) {
            _hashCode += getFechaDesde().hashCode();
        }
        if (getFechaHasta() != null) {
            _hashCode += getFechaHasta().hashCode();
        }
        _hashCode += getGrupo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Wsbcucotizacionesin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Cotiza", "wsbcucotizacionesin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Cotiza", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "FechaDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "FechaHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupo");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Grupo"));
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
