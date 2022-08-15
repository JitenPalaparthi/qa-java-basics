package shape;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeTest {
	static ArrayList<Shape> list;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Instantiationg the list before tests are called");
	list = new ArrayList<Shape>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Nullifying the list after tests are called");
		list=null;
		System.gc();// calling garbage collector
	}

	@Before
	public void setUp() throws Exception {
	Shape s1 = new Rectangle(12.3f,14.4f);
	Shape s2 = new Square(25.25f);
	list.add(s1);
	list.add(s2);
	}

	@After
	public void tearDown() throws Exception {
		list.removeAll(list);
	}

	@Test
	public void testSizeOfList() {
		assertEquals(2,list.size());
	}
	
	@Test
	public void testareaAndperimeterOfRectAndSquare() {
		float a1=list.get(0).area();
		float p1=list.get(0).perimeter();
		float a2=list.get(1).area();
		float p2=list.get(1).perimeter();
		
		assertEquals(177.12,a1,.12);
		assertEquals(53.4,p1,.4);
		assertEquals(637.5625,a2,.5625);
		assertEquals(101,p2,.0);
	}
	@Test
	public void testareaRectangle() {
		float a1=list.get(0).area();
		assertEquals(177.12,a1,.12);
	}
	
	@Test
	public void testperimeterOfRectangle() {
		float p1=list.get(0).perimeter();
		assertEquals(53.4,p1,.4);
	}
	
	@Test
	public void testareaSquare() {
		float a2=list.get(1).area();
		assertEquals(637.5625,a2,.5625);
	}
	
	@Test
	public void testperimeterOfSquare() {
		float p2=list.get(1).perimeter();
		assertEquals(101,p2,.0);
	}
}
