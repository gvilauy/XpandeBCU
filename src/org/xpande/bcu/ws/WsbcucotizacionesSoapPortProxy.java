package org.xpande.bcu.ws;

public class WsbcucotizacionesSoapPortProxy implements org.xpande.bcu.ws.WsbcucotizacionesSoapPort {
  private String _endpoint = null;
  private org.xpande.bcu.ws.WsbcucotizacionesSoapPort wsbcucotizacionesSoapPort = null;
  
  public WsbcucotizacionesSoapPortProxy() {
    _initWsbcucotizacionesSoapPortProxy();
  }
  
  public WsbcucotizacionesSoapPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsbcucotizacionesSoapPortProxy();
  }
  
  private void _initWsbcucotizacionesSoapPortProxy() {
    try {
      wsbcucotizacionesSoapPort = (new org.xpande.bcu.ws.WsbcucotizacionesLocator()).getwsbcucotizacionesSoapPort();
      if (wsbcucotizacionesSoapPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsbcucotizacionesSoapPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsbcucotizacionesSoapPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsbcucotizacionesSoapPort != null)
      ((javax.xml.rpc.Stub)wsbcucotizacionesSoapPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.xpande.bcu.ws.WsbcucotizacionesSoapPort getWsbcucotizacionesSoapPort() {
    if (wsbcucotizacionesSoapPort == null)
      _initWsbcucotizacionesSoapPortProxy();
    return wsbcucotizacionesSoapPort;
  }
  
  public org.xpande.bcu.ws.WsbcucotizacionesExecuteResponse execute(org.xpande.bcu.ws.WsbcucotizacionesExecute parameters) throws java.rmi.RemoteException{
    if (wsbcucotizacionesSoapPort == null)
      _initWsbcucotizacionesSoapPortProxy();
    return wsbcucotizacionesSoapPort.execute(parameters);
  }
  
  
}