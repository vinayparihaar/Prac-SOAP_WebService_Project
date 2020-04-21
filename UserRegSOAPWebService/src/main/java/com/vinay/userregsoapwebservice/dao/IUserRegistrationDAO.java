package com.vinay.userregsoapwebservice.dao;

import com.vinay.userregsoapwebservice.model.UserDetails;

public interface IUserRegistrationDAO {
	
	public boolean createUser(UserDetails userDetails);
	public UserDetails getUser(String email);

}
