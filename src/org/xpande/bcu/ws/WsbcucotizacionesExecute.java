/**
 * WsbcucotizacionesExecute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class WsbcucotizacionesExecute  implements java.io.Serializable {
    private org.xpande.bcu.ws.Wsbcucotizacionesin entrada;

    public WsbcucotizacionesExecute() {
    }

    public WsbcucotizacionesExecute(
            org.xpande.bcu.ws.Wsbcucotizacionesin entrada) {
           this.entrada = entrada;
    }


    /**
     * Gets the entrada value for this WsbcucotizacionesExecute.
     * 
     * @return entrada
     */
    public org.xpande.bcu.ws.Wsbcucotizacionesin getEntrada() {
        return entrada;
    }


    /**
     * Sets the entrada value for this WsbcucotizacionesExecute.
     * 
     * @param entrada
     */
    public void setEntrada(org.xpande.bcu.ws.Wsbcucotizacionesin entrada) {
        this.entrada = entrada;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WsbcucotizacionesExecute)) return false;
        WsbcucotizacionesExecute other = (WsbcucotizacionesExecute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrada==null && other.getEntrada()==null) || 
             (this.entrada!=null &&
              this.entrada.equals(other.getEntrada())));
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
        if (getEntrada() != null) {
            _hashCode += getEntrada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsbcucotizacionesExecute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Cotiza", ">wsbcucotizaciones.Execute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrada");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "Entrada"));
        elemField.setXmlType(new javax.xml.namespace.QName("Cotiza", "wsbcucotizacionesin"));
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
