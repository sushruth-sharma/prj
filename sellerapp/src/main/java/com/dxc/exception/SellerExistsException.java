package com.dxc.exception;

@SuppressWarnings("serial")
public class SellerExistsException extends Exception {
	String msg;

	public SellerExistsException() {
		super();
	}

	public SellerExistsException(String msg) {
		super(msg);
		
	}
}
