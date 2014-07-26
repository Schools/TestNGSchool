package com.naren.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.naren.business.HelloWorld;

public class TestFactoryImpl2 {

	HelloWorld helloWorld;
	@Factory(dataProvider = "dp")
	public TestFactoryImpl2(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	@Test(enabled = true)
	public void testHelloWorld() {
		String greeting = helloWorld.greetPerson();
		System.out.println(greeting);
		Assert.assertEquals(greeting, "Hello Naren!!!");
	}
	
	@DataProvider
	static public Object[][] dp() {
	  return new Object[][] {
	    new Object[] {new HelloWorld("Naren") },
	    new Object[] {new HelloWorld("Ram")},
	  };
	}
}
