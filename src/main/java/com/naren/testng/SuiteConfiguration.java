package com.naren.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfiguration {
	// Setup & Tear Down Methods for Suite and Test Classes
	@BeforeSuite(enabled=true)
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
 
	@AfterSuite(enabled=true)
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}
 
	@BeforeTest(enabled=true)
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
 
	@AfterTest(enabled=true)
	public void afterTest() {
		System.out.println("@AfterTest");
	}	
}
