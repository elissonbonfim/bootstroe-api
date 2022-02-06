package com.elisson.bookstore.exceptions;

public class DataIntegrityViolationException extends RuntimeException {

	private static final long serialVersionUID = 3643541986251041632L;

	public DataIntegrityViolationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataIntegrityViolationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
