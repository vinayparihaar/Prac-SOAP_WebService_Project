package com.vinay.userregsoapwebservice.service;

import com.vinay.userregsoapwebservice.beans.User;
import com.vinay.userregsoapwebservice.exceptions.InvalidInputException;

public interface IUserRegistrationService {
	
	public boolean createUser(User user) throws InvalidInputException;
	public User getUser(String uesrEmail);

}
