package com.vinay.userregsoapwebservice.service.impl;

import com.vinay.userregsoapwebservice.beans.User;
import com.vinay.userregsoapwebservice.dao.IUserRegistrationDAO;
import com.vinay.userregsoapwebservice.dao.impl.UserRegistrationDAO;
import com.vinay.userregsoapwebservice.exceptions.InvalidInputException;
import com.vinay.userregsoapwebservice.model.UserDetails;
import com.vinay.userregsoapwebservice.service.IUserRegistrationService;

public class UserRegistrationService implements IUserRegistrationService {
	IUserRegistrationDAO iUserRegistrationDAO = new UserRegistrationDAO();

	@Override
	public boolean createUser(User user) throws InvalidInputException {
		UserDetails userDetails = new UserDetails();
		userDetails.setName(user.getUserName());
		userDetails.setEmail(user.getUserEmail());
		userDetails.setPassword(user.getPassword());
		return iUserRegistrationDAO.createUser(userDetails);

	}

	@Override
	public User getUser(String userEmail) {

		UserDetails userDetails = iUserRegistrationDAO.getUser(userEmail);
		User user = new User();
		user.setUserName(userDetails.getName());
		user.setUserEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		return user;

	}

}
