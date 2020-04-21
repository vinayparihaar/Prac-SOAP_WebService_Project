/**
 * UserRegistrationResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vinay.userregsoapwebservice.resource.impl;

public interface UserRegistrationResource extends java.rmi.Remote {
    public boolean createUser(com.vinay.userregsoapwebservice.resource.impl.User arg0) throws java.rmi.RemoteException, com.vinay.userregsoapwebservice.resource.impl.InvalidInputException;
    public com.vinay.userregsoapwebservice.resource.impl.User getUser(java.lang.String arg0) throws java.rmi.RemoteException, com.vinay.userregsoapwebservice.resource.impl.InvalidInputException;
}
