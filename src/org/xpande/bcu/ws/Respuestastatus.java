/**
 * Respuestastatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class Respuestastatus  implements java.io.Serializable {
    private byte status;

    private short codigoerror;

    private String mensaje;

    public Respuestastatus() {
    }

    public Respuestastatus(
           byte status,
           short codigoerror,
           String mensaje) {
           this.status = status;
           this.codigoerror = codigoerror;
           this.mensaje = mensaje;
    }


    /**
     * Gets the status value for this Respuestastatus.
     * 
     * @return status
     */
    public byte getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Respuestastatus.
     * 
     * @param status
     */
    public void setStatus(byte status) {
        this.status = status;
    }


    /**
     * Gets the codigoerror value for this Respuestastatus.
     * 
     * @return codigoerror
     */
    public short getCodigoerror() {
        return codigoerror;
    }


    /**
     * Sets the codigoerror value for this Respuestastatus.
     * 
     * @param codigoerror
     */
    public void setCodigoerror(short codigoerror) {
        this.codigoerror = codigoerror;
    }


    /**
     * Gets the mensaje value for this Respuestastatus.
     * 
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Respuestastatus.
     * 
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Respuestastatus)) return false;
        Respuestastatus other = (Respuestastatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            this.codigoerror == other.getCodigoerror() &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje())));
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
        _hashCode += getStatus();
        _hashCode += getCodigoerror();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Respuestastatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Cotiza", "respuestastatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoerror");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "codigoerror"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("Cotiza", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
