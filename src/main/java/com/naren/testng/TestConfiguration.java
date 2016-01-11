package com.naren.testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * TestNGAnnotations - This test case has been written to check the preference given to Annotations.
 * @author Narendran
 *
 */
@Test(groups="allTests")
public class TestConfiguration {
	
	//Setup Methods Starts Here
	
	@BeforeClass(enabled =true)
	public void beforeClass(){
		System.out.println("In BeforeClass");
	}
	
	@BeforeMethod(enabled =true)
	public void beforeMethod(){
		System.out.println("In BeforeMethod");
	}

	//Setup Methods Ends Here
	/**
	 * Test Method 1
	 */
	@Test(enabled =true, groups={"fast","window.One","unix.One","release1.one"})
	public void testOne(){
		System.out.println("In TestOne");
	}

	/**
	 * Test Method 2
	 */
	@Test(enabled =true, groups={"fast","window.Two","unix.Two","release1.Two"})
	public void testTwo(){
		System.out.println("In TestTwo");
	}
	
	/**
	 * Test Method 3
	 */
	@Test(enabled =true, groups={"slow","unix.Three","release2.Three"})
	public void testThree(){
		System.out.println("In TestThree");
	}

	/**
	 * Test Method 4
	 */
	@Test(enabled =true, groups={"slow","unix.Four","release2.Three"})
	public void testFour(){
		System.out.println("In TestFour");
	}
	
	/**
	 * Test Method 5
	 */
	@Test(enabled=true,  
			groups={"slow","unix.Five","release2.Three"}, 
			dependsOnMethods={"testFour"})
	// Hard Dependency - Depends on order and execution
	public void testFive(){
		System.out.println("In TestFive");
	}
	
	/**
	 * Test Method 6
	 */
	@Test(enabled=true,  
			groups={"slow","unix.Five","release2.Three"}, 
			dependsOnMethods={"testFive"}, alwaysRun=true) 
	// Soft Dependency - Depends on order
	public void testSix(){
		System.out.println("In TestSix");
	}
	

	// Tear Down Methods Starts Here
	
	@AfterMethod(enabled =true)
	public void afterMethod(){
		System.out.println("In AfterMethod");
	}

	@AfterClass(enabled =true)
	public void afterClass(){
		System.out.println("In AfterClass");
	}
	
	// Tear Down Methods Ends Here

	/* 
	Dependency in XML
	 <test name="My suite">
	  <groups>
	    <dependencies>
	      <group name="c" depends-on="a  b" />
	      <group name="z" depends-on="c" />
	    </dependencies>
	  </groups>
	</test>
	*/
}