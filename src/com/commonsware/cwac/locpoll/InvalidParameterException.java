package com.commonsware.cwac.locpoll;

public class InvalidParameterException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidParameterException(String parameters) {
		super(parameters);
	}
  }