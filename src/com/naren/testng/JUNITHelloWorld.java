package com.naren.testng;

import junit.framework.Assert;
import org.junit.Test;
import com.naren.business.HelloWorld;

public class JUNITHelloWorld {

	@Test
	public void testStaticHelloWorld() {
		String greeting = HelloWorld.staticDisplay();
		Assert.assertEquals(greeting, "Hello World!!!");
	}

	/**
	 * Instance Method Testing - HelloWorld display
	 * 
	 * @param helloWorld
	 */
	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		String greeting = helloWorld.display();
		Assert.assertEquals(greeting, "Hello World!!!");
	}

}
