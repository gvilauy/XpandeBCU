/**
 * WsbcucotizacionesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xpande.bcu.ws;

public class WsbcucotizacionesLocator extends org.apache.axis.client.Service implements org.xpande.bcu.ws.Wsbcucotizaciones {

    public WsbcucotizacionesLocator() {
    }


    public WsbcucotizacionesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsbcucotizacionesLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsbcucotizacionesSoapPort
    private String wsbcucotizacionesSoapPort_address = "https://cotizaciones.bcu.gub.uy/wscotizaciones/servlet/awsbcucotizaciones";

    public String getwsbcucotizacionesSoapPortAddress() {
        return wsbcucotizacionesSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String wsbcucotizacionesSoapPortWSDDServiceName = "wsbcucotizacionesSoapPort";

    public String getwsbcucotizacionesSoapPortWSDDServiceName() {
        return wsbcucotizacionesSoapPortWSDDServiceName;
    }

    public void setwsbcucotizacionesSoapPortWSDDServiceName(String name) {
        wsbcucotizacionesSoapPortWSDDServiceName = name;
    }

    public org.xpande.bcu.ws.WsbcucotizacionesSoapPort getwsbcucotizacionesSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsbcucotizacionesSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsbcucotizacionesSoapPort(endpoint);
    }

    public org.xpande.bcu.ws.WsbcucotizacionesSoapPort getwsbcucotizacionesSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.xpande.bcu.ws.WsbcucotizacionesSoapBindingStub _stub = new org.xpande.bcu.ws.WsbcucotizacionesSoapBindingStub(portAddress, this);
            _stub.setPortName(getwsbcucotizacionesSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsbcucotizacionesSoapPortEndpointAddress(String address) {
        wsbcucotizacionesSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.xpande.bcu.ws.WsbcucotizacionesSoapPort.class.isAssignableFrom(serviceEndpointInterface)) {
                org.xpande.bcu.ws.WsbcucotizacionesSoapBindingStub _stub = new org.xpande.bcu.ws.WsbcucotizacionesSoapBindingStub(new java.net.URL(wsbcucotizacionesSoapPort_address), this);
                _stub.setPortName(getwsbcucotizacionesSoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("wsbcucotizacionesSoapPort".equals(inputPortName)) {
            return getwsbcucotizacionesSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("Cotiza", "wsbcucotizaciones");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("Cotiza", "wsbcucotizacionesSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("wsbcucotizacionesSoapPort".equals(portName)) {
            setwsbcucotizacionesSoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
