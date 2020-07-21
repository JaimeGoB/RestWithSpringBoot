package com.SpringRestProject.exception;

import java.util.Date;

public class ExceptionResponse {

	private static final long serialVersionUID = 1L;
	
	private Date timestap;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestap, String message, String details) {
		this.timestap = timestap;
		this.message = message;
		this.details = details;
	}

	public Date getTimestap() {
		return timestap;
	}


	public String getMessage() {
		return message;
	}


	public String getDetails() {
		return details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
