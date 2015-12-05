package com.adp.exceptions;

public class VehicleIDNullException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = null;

	public VehicleIDNullException() {
	        super();
	    }

	public VehicleIDNullException(String message) {
	        super(message);
	        this.message = message;
	    }

	public VehicleIDNullException(Throwable cause) {
	        super(cause);
	    }

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
