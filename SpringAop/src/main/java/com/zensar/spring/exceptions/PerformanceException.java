package com.zensar.spring.exceptions;

/**
 * @author akansh_sai
 *
 */
public class PerformanceException extends Exception {
	private String errorMessage;
	public PerformanceException() {
	errorMessage="Sorry performance is not satisfactory 1/10";
		
	}
	public PerformanceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "PerformanceException [errorMessage=" + errorMessage + "]";
	}
	
}
