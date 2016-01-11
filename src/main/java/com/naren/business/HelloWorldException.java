package com.naren.business;

public class HelloWorldException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4819629282714179751L;
	
	public HelloWorldException()
	{
		super();
	}
	
	public HelloWorldException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	public HelloWorldException(String message, Throwable cause){
		super(message,cause);
	}
	
	public HelloWorldException(Throwable cause){
		super(cause);
	}

}
