package kill.me.later;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SomeTest {
	
	private int id = 0;
	private String account = "";
	
	public SomeTest(int id, String account) {
		this.id = id;
		this.account = account;
	}
	
	@Test
	public void firstTest() {
		System.out.println("Test #1 with data: "+id+". "+account);
		assertTrue(true);
	}
	
	@Test
	public void secondTest() {
		System.out.println("Test #2 with data: "+id+". "+account);
		assertTrue(true);
	}
	
	@Test
	public void thirdTest() {
		System.out.println("Test #3 with data: "+id+". "+account);
		assertTrue(true);
	}

}
