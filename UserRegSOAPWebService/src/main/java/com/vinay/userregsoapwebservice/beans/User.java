package com.vinay.userregsoapwebservice.beans;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String userEmail;
	private String password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId,String userName, String userEmail, String password) {
		super();
		this.userId=userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
