package com.naren.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import com.naren.business.HelloWorld;

public class TestFactory {

	@Factory
	public Object[] createInstances() {
		Object[] result = new Object[10];
		for (int i = 0; i < 10; i++) {
			result[i] = new TestFactoryImpl1(new HelloWorld("Naren"));
		}
		return result;
	}	
	
	
	@Factory(dataProvider="dp")
	public Object[] createInstances(HelloWorld helloWorld) {
		return new Object[] {new TestFactoryImpl1(helloWorld)};
	}
	
	
	@DataProvider
	static public Object[][] dp() {
	  return new Object[][] {
	    new Object[] {new HelloWorld("Naren") },
	    new Object[] {new HelloWorld("Ram")},
	  };
	}
}
