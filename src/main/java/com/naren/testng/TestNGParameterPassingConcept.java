package com.naren.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.naren.business.HelloWorld;

public class TestNGParameterPassingConcept {

	/**
	 * This Data Provider is the fixture of the test. Its name defaults to
	 * Method Name
	 * 
	 * @return
	 */
	@DataProvider(name = "display")
	public Object[][] displayData() {
		System.out.println("In displayData Data Provider");
		return new Object[][] {//An array of array of objects (Object[][]) where the first dimension's size is the number of times the test method will be invoked and the second dimension size contains an array of objects 
		new Object[] { new HelloWorld() } };
	}
	
	/**
	 * Specifying parameters in testng.xml might not be sufficient if you need to pass complex parameters,
	 * or parameters that need to be created from Java.
	 * Hence we go for Data Providers. 
	 * We cannot mix data Providers with Parameters on a test method and dataProvider methods.
	 * @return
	 */
	@DataProvider(name = "testGreetPerson")
	public Object[][] greetPersonData() {
		System.out.println("In testGreetPerson Data Provider");
		return new Object[][] { 
	    //An array of array of objects (Object[][]) 
		//where the first dimension's size is the number of times the test method will be invoked 
		//and the second dimension size contains an array of objects 
		new Object[] { new HelloWorld(), "Naren" },
		new Object[] { new HelloWorld(), "Ram" }};
	}
		
	/**
	 * Instance Method Testing - HelloWorld display
	 * 
	 * @param helloWorld
	 */
	@Test(enabled = true, dataProvider = "display")
	public void testHelloWorld(HelloWorld helloWorld) {
		String greeting = helloWorld.display();
		Assert.assertEquals(greeting, "Hello World!!!");
	}

	/**
	 * Test Method With Simple Parameter
	 * Parameters can be either from XML file or from Properties file.
	 * @param name
	 */
	@Test(enabled=true)
	@Parameters(value={"name"})
	public void testGreetPersonWithParameters(@Optional("Ram") String name) {
		HelloWorld helloWorld = new HelloWorld();
		String greeting = helloWorld.greetPerson(name);
		Assert.assertEquals(greeting, "Hello Ram!!!");
	}
	
	/**
	 * Test Method With Data Provider
	 * @param helloWorld
	 * @param name
	 */
	@Test(enabled = true, dataProvider = "testGreetPerson")
	public void testGreetPerson(HelloWorld helloWorld, String name) {
		String greeting = helloWorld.greetPerson(name);
		Assert.assertEquals(greeting, "Hello Naren!!!");
	}
}
