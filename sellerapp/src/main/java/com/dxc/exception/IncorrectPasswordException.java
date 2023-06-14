package com.dxc.exception;

@SuppressWarnings("serial")
public class IncorrectPasswordException extends Exception {
	String msg;

	public IncorrectPasswordException() {
		super();
	}

	public IncorrectPasswordException(String msg) {
		super(msg);
		
	}
}
