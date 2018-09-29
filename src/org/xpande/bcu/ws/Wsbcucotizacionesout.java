/**
 * Wsbcucotizacionesout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class Wsbcucotizacionesout  implements java.io.Serializable {
    private org.xpande.bcu.ws.Respuestastatus respuestastatus;

    private org.xpande.bcu.ws.DatoscotizacionesDato[] datoscotizaciones;

    public Wsbcucotizacionesout() {
    }

    public Wsbcucotizacionesout(org.xpande.bcu.ws.Respuestastatus respuestastatus,
                                org.xpande.bcu.ws.DatoscotizacionesDato[] datoscotizaciones) {
           this.respuestastatus = respuestastatus;
           this.datoscotizaciones = datoscotizaciones;
    }


    /**
     * Gets the respuestastatus value for this Wsbcucotizacionesout.
     * 
     * @return respuestastatus
     */
    public org.xpande.bcu.ws.Respuestastatus getRespuestastatus() {
        return respuestastatus;
    }


    /**
     * Sets the respuestastatus value for this Wsbcucotizacionesout.
     * 
     * @param respuestastatus
     */
    public void setRespuestastatus(org.xpande.bcu.ws.Respuestastatus respuestastatus) {
        this.respuestastatus = respuestastatus;
    }


    /**
     * Gets the datoscotizaciones value for this Wsbcucotizacionesout.
     * 
     * @return datoscotizaciones
     */
    public org.xpande.bcu.ws.DatoscotizacionesDato[] getDatoscotizaciones() {
        return datoscotizaciones;
    }


    /**
     * Sets the datoscotizaciones value for this Wsbcucotizacionesout.
     * 
     * @param datoscotizaciones
     */
    public void setDatoscotizaciones(org.xpande.bcu.ws.DatoscotizacionesDato[] datoscotizaciones) {
        this.datoscotizaciones = datoscotizaciones;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Wsbcucotizacionesout)) return false;
        Wsbcucotizacionesout other = (Wsbcucotizacionesout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuestastatus==null && other.getRespuestastatus()==null) || 
             (this.respuestastatus!=null &&
              this.respuestastatus.equals(other.getRespuestastatus()))) &&
            ((this.datoscotizaciones==null && other.getDatoscotizaciones()==null) || 
             (this.datoscotizaciones!=null &&
              java.util.Arrays.equals(this.datoscotizaciones, other.getDatoscotizaciones())));
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
        if (getRespuestastatus() != null) {
            _hashCode += getRespuestastatus().hashCode();
        }
        if (getDatoscotizaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatoscotizaciones());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDatoscotizaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Wsbcucotizacionesout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Cotiza", "wsbcucotizacionesout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestastatus");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "respuestastatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("Cotiza", "respuestastatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datoscotizaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "datoscotizaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("Cotiza", "datoscotizaciones.dato"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Cotiza", "datoscotizaciones.dato"));
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
