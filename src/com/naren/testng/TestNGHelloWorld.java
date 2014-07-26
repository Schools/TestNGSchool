package com.naren.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.naren.business.HelloWorld;

public class TestNGHelloWorld {

	@Test(enabled = true)
	public void testStaticHelloWorld() {
		String greeting = HelloWorld.staticDisplay();
		Assert.assertEquals(greeting, "Hello World!!!");
	}
	
	/**
	 * Instance Method Testing - HelloWorld display
	 * 
	 * @param helloWorld
	 */
	@Test(enabled = true)
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		String greeting = helloWorld.display();
		Assert.assertEquals(greeting, "Hello World!!!");
	}

}
