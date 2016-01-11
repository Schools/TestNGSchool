package com.naren.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.naren.business.HelloWorld;
import com.naren.business.HelloWorldException;

public class TestNGParallelTests {

	@Test(enabled = true, threadPoolSize = 3, invocationCount = 10,  timeOut = 10000)
	public void testStaticHelloWorld() {
		String greeting = HelloWorld.staticDisplay();
		Assert.assertEquals(greeting, "Hello World!!!");
	}
	
	/**
	 * Instance Method Testing - HelloWorld display
	 * 
	 * @param helloWorld
	 * @throws InterruptedException 
	 */
	@Test(enabled = true, 
			threadPoolSize = 3, // No of worker threads
			invocationCount = 10,  // no. of times this method should be invoked
			timeOut = 10000, // Throw time out when it exceeds 10000ms
			expectedExceptions = {ArithmeticException.class,HelloWorldException.class})
	public void testHelloWorld() throws InterruptedException {
		
		HelloWorld helloWorld = new HelloWorld();
			Thread.sleep(1000);

		String greeting = helloWorld.display();
		Assert.assertEquals(greeting, "Hello World!!!");
		int i = 1/0;// If this in the first line, all other lines becomes not reachable.
	}

	// <suite name="My suite" parallel="methods" thread-count="5"> - TestNG will run all your test methods in separate threads.
	// <suite name="My suite" parallel="tests" thread-count="5"> - TestNG will run all the methods in the same <test> tag in the same thread
	// <suite name="My suite" parallel="classes" thread-count="5"> - TestNG will run all the methods in the same class in the same thread
	// <suite name="My suite" parallel="instances" thread-count="5"> - TestNG will run all the methods in the same instance in the same thread, but two methods on two different instances will be running in different threads.

}
