package com.vinay.userregsoapwebservice.resource.impl;

public class UserRegistrationResourceProxy implements com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResource {
  private String _endpoint = null;
  private com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResource userRegistrationResource = null;
  
  public UserRegistrationResourceProxy() {
    _initUserRegistrationResourceProxy();
  }
  
  public UserRegistrationResourceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserRegistrationResourceProxy();
  }
  
  private void _initUserRegistrationResourceProxy() {
    try {
      userRegistrationResource = (new com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceLocator()).getUserRegistrationResourcePort();
      if (userRegistrationResource != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userRegistrationResource)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userRegistrationResource)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userRegistrationResource != null)
      ((javax.xml.rpc.Stub)userRegistrationResource)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResource getUserRegistrationResource() {
    if (userRegistrationResource == null)
      _initUserRegistrationResourceProxy();
    return userRegistrationResource;
  }
  
  public boolean createUser(com.vinay.userregsoapwebservice.resource.impl.User arg0) throws java.rmi.RemoteException, com.vinay.userregsoapwebservice.resource.impl.InvalidInputException{
    if (userRegistrationResource == null)
      _initUserRegistrationResourceProxy();
    return userRegistrationResource.createUser(arg0);
  }
  
  public com.vinay.userregsoapwebservice.resource.impl.User getUser(java.lang.String arg0) throws java.rmi.RemoteException, com.vinay.userregsoapwebservice.resource.impl.InvalidInputException{
    if (userRegistrationResource == null)
      _initUserRegistrationResourceProxy();
    return userRegistrationResource.getUser(arg0);
  }
  
  
}