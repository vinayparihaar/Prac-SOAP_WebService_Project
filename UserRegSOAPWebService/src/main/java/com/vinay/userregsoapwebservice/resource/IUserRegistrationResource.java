package com.vinay.userregsoapwebservice.resource;

import com.vinay.userregsoapwebservice.beans.User;
import com.vinay.userregsoapwebservice.exceptions.InvalidInputException;

public interface IUserRegistrationResource {
	
	public boolean createUser(User user) throws InvalidInputException;
	public User getUser(String userEmail) throws InvalidInputException;

}
