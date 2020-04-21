package com.vinay.soap.client.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import com.vinay.soap.client.beans.User;
import com.vinay.soap.client.service.IRegistrationService;
import com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceLocator;
import com.vinay.userregsoapwebservice.resource.impl.UserRegistrationResourceServiceSoapBindingStub;

public class RegistrationService implements  IRegistrationService {
	private static final String URL = "http://localhost:8080/UserRegSOAPWebService-0.0.1-SNAPSHOT/UserRegistrationResource?wsdl";

	public User getUser(String email) {
		User clientUser = null;
		try {
			URL url = new URL(URL);
			UserRegistrationResourceServiceLocator service = new UserRegistrationResourceServiceLocator();
			UserRegistrationResourceServiceSoapBindingStub bindingStub = new UserRegistrationResourceServiceSoapBindingStub(
					url, service);
			com.vinay.userregsoapwebservice.resource.impl.User user = bindingStub.getUser(email);
			clientUser = new User();
			clientUser.setId(user.getUserId());
			clientUser.setEmail(user.getUserEmail());
			clientUser.setName(user.getUserName());
			clientUser.setPassword(user.getPassword());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientUser;

	}

	@Override
	public boolean createUser(User user) {
		// boolean result =false;
		try {
			URL url = new URL(URL);
			UserRegistrationResourceServiceLocator service = new UserRegistrationResourceServiceLocator();

			UserRegistrationResourceServiceSoapBindingStub bindingStub = new UserRegistrationResourceServiceSoapBindingStub(
					url, service);

			// User inputUser= new User();
			com.vinay.userregsoapwebservice.resource.impl.User user2 = new com.vinay.userregsoapwebservice.resource.impl.User();
			user2.setUserName(user.getName());
			user2.setUserEmail(user.getEmail());
			user2.setPassword(user.getPassword());
			return bindingStub.createUser(user2);

		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
