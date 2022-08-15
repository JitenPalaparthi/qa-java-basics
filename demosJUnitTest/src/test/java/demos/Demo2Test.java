package demos;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class Demo2Test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(timeout = 1000)
	public void test2() {
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	// Whether the code is properly raining exceptions or not
	@Test(expected = ArithmeticException.class)
	public void test3() {
		double d = 1/0;
	   // throw new ArithmeticException();
		
	}
	
	@Test(expected = Exception.class)
 	public void test4() {
		int[] arr= new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
	   // throw new ArithmeticException();
	}
}
