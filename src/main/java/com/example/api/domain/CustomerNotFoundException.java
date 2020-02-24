package com.example.api.domain;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(String exception) {
		super(exception);
	}

}