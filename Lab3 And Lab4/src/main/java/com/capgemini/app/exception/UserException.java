package com.capgemini.app.exception;

public class UserException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UserException(String msg) {
		super(msg);
	}

}
