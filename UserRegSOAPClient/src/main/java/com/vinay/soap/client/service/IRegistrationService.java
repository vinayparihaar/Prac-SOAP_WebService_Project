package com.vinay.soap.client.service;

import com.vinay.soap.client.beans.User;

public interface IRegistrationService {

	public boolean createUser(User user);
	public User getUser(String email);
	

}