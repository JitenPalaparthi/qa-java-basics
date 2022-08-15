package demos;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void addtest() {
		//fail("Not yet implemented");
		Calc c1 = new Calc();
		int expOut =c1.add(10, 20);
		assertEquals("Are both equal?",30,expOut);
		assertNotEquals(31,expOut);
		expOut= c1.add(10, -10);
		assertEquals(0,expOut);
	}
    
}
