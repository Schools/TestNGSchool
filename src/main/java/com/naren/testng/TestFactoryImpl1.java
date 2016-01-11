package com.naren.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.naren.business.HelloWorld;

public class TestFactoryImpl1 {
	
	private HelloWorld helloWorld;
	
	public TestFactoryImpl1(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

	@Test(enabled = true)
	public void testHelloWorld() {
		String greeting = helloWorld.greetPerson();
		System.out.println(greeting + " "+Thread.currentThread().getName());
		Assert.assertEquals(greeting, "Hello Naren!!!");
	}
}
