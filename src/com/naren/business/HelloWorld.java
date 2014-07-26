package com.naren.business;

public class HelloWorld {
	
	private String name;
	
	public HelloWorld() {
		super();
	}
	
	
	public HelloWorld(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String greetPerson(String name)
	{
		return "Hello "+name+"!!!";
	}
	
	public String greetPerson()
	{
		return "Hello "+name+"!!!";
	}

	public static String staticDisplay()
	{
		return "Hello World!!!";
	}
	
	
	public String display()
	{
		return "Hello World!!!";
	}
	
	
	public void displayWithException() throws HelloWorldException
	{
		throw new HelloWorldException("HelloWorld!!!");
	}
}
