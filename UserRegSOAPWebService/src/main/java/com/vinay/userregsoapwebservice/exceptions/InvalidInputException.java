package com.vinay.userregsoapwebservice.exceptions;

public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorDetails;

	public InvalidInputException(int errorCode, String errorDetails) {
		super();
		this.errorCode = errorCode;
		this.errorDetails = errorDetails;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

}
