/**
 * WsbcucotizacionesExecuteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class WsbcucotizacionesExecuteResponse  implements java.io.Serializable {
    private org.xpande.bcu.ws.Wsbcucotizacionesout salida;

    public WsbcucotizacionesExecuteResponse() {
    }

    public WsbcucotizacionesExecuteResponse(
            org.xpande.bcu.ws.Wsbcucotizacionesout salida) {
           this.salida = salida;
    }


    /**
     * Gets the salida value for this WsbcucotizacionesExecuteResponse.
     * 
     * @return salida
     */
    public org.xpande.bcu.ws.Wsbcucotizacionesout getSalida() {
        return salida;
    }


    /**
     * Sets the salida value for this WsbcucotizacionesExecuteResponse.
     * 
     * @param salida
     */
    public void setSalida(org.xpande.bcu.ws.Wsbcucotizacionesout salida) {
        this.salida = salida;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WsbcucotizacionesExecuteResponse)) return false;
        WsbcucotizacionesExecuteResponse other = (WsbcucotizacionesExecuteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salida==null && other.getSalida()==null) || 
             (this.salida!=null &&
              this.salida.equals(other.getSalida())));
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
        if (getSalida() != null) {
            _hashCode += getSalida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsbcucotizacionesExecuteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Cotiza", ">wsbcucotizaciones.ExecuteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salida");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Salida"));
        elemField.setXmlType(new javax.xml.namespace.QName("Cotiza", "wsbcucotizacionesout"));
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
