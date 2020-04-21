/**
 * UserRegistrationResourceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinay.userregsoapwebservice.resource.impl;

public class UserRegistrationResourceServiceLocator extends org.apache.axis.client.Service implements com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceService {

    public UserRegistrationResourceServiceLocator() {
    }


    public UserRegistrationResourceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserRegistrationResourceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserRegistrationResourcePort
    private java.lang.String UserRegistrationResourcePort_address = "http://localhost:8080/UserRegSOAPWebService-0.0.1-SNAPSHOT/UserRegistrationResource";

    public java.lang.String getUserRegistrationResourcePortAddress() {
        return UserRegistrationResourcePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserRegistrationResourcePortWSDDServiceName = "UserRegistrationResourcePort";

    public java.lang.String getUserRegistrationResourcePortWSDDServiceName() {
        return UserRegistrationResourcePortWSDDServiceName;
    }

    public void setUserRegistrationResourcePortWSDDServiceName(java.lang.String name) {
        UserRegistrationResourcePortWSDDServiceName = name;
    }

    public com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResource getUserRegistrationResourcePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserRegistrationResourcePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserRegistrationResourcePort(endpoint);
    }

    public com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResource getUserRegistrationResourcePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceSoapBindingStub _stub = new com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserRegistrationResourcePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserRegistrationResourcePortEndpointAddress(java.lang.String address) {
        UserRegistrationResourcePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResource.class.isAssignableFrom(serviceEndpointInterface)) {
                com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceSoapBindingStub _stub = new com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceSoapBindingStub(new java.net.URL(UserRegistrationResourcePort_address), this);
                _stub.setPortName(getUserRegistrationResourcePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserRegistrationResourcePort".equals(inputPortName)) {
            return getUserRegistrationResourcePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.resource.userregsoapwebservice.vinay.com/", "UserRegistrationResourceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.resource.userregsoapwebservice.vinay.com/", "UserRegistrationResourcePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserRegistrationResourcePort".equals(portName)) {
            setUserRegistrationResourcePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
