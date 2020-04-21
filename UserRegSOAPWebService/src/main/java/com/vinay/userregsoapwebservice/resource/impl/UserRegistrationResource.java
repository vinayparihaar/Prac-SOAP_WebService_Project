package com.vinay.userregsoapwebservice.resource.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vinay.userregsoapwebservice.beans.User;
import com.vinay.userregsoapwebservice.exceptions.InvalidInputException;
import com.vinay.userregsoapwebservice.resource.IUserRegistrationResource;
import com.vinay.userregsoapwebservice.service.IUserRegistrationService;
import com.vinay.userregsoapwebservice.service.impl.UserRegistrationService;

@WebService
public class UserRegistrationResource implements IUserRegistrationResource {
	IUserRegistrationService iUserRegistrationService= new UserRegistrationService();
	
	@WebMethod
	@Override
	public boolean createUser(User user) throws InvalidInputException {
		validateUser(user);
		return iUserRegistrationService.createUser(user);
		
	}


	@WebMethod
	@Override
	public User getUser(String userEmail) throws InvalidInputException {
		if (userEmail==null  || userEmail.trim().length()<=0) {
			throw new InvalidInputException(101,"Invalid Email");
		}
		return iUserRegistrationService.getUser(userEmail);
		 
	}
	
	private void validateUser(User user) throws InvalidInputException {
		if (user == null) {
			throw new InvalidInputException(101, "User Details cannot be empty");
		}
		if (user.getUserName() == null || user.getUserName().trim().length()<=0) {
			throw new InvalidInputException(102, "Name is Required Field!!!");

		} else if (user.getUserEmail() == null) {
			throw new InvalidInputException(103, "Email is Required Field!!!");

		} else if (user.getPassword() == null) {
			throw new InvalidInputException(104, "Password is Required Field!!!");
		}
	}
	
}
