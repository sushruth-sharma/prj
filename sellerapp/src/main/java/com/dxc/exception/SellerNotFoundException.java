package com.dxc.exception;

@SuppressWarnings("serial")
public class SellerNotFoundException extends Exception {
	String msg;

	public SellerNotFoundException() {
		super();
	}

	public SellerNotFoundException(String msg) {
		super(msg);
		
	}
}
