package JUnit_Tests;

import static org.junit.Assert.*;
import com.testing.junit.Map;
import org.junit.Test;

public class Map_Get_Set {
	Map m = new Map(10, 10);
	
	// Testing x and y getters and setters
	
	@Test
	public void test001() {
		int x = m.getX();
		int y = m.getY();
		assertEquals(10, x);
		assertEquals(10, y);
	}
	
	@Test 
	public void test002() {
		m.setX(50);
		int x = m.getX();
		assertEquals(50, x);
		assertNotSame(10, x);
	}
	
	@Test 
	public void test003() {
		m.setY(30);
		int y = m.getY();
		assertEquals(30, y);
		assertNotSame(10, y);
	}
	
	@Test 
	public void test004() {
		m.setX(50);
		m.setY(30);
		int x = m.getX();
		int y = m.getY();
		assertEquals(50, x);
		assertEquals(30, y);
	}
	
	// Testing currentx and currenty getters and setters

	@Test
	public void test005() {
		int x = m.getCurrentx();
		int y = m.getCurrenty();
		assertEquals(0, x);
		assertEquals(0, y);
	}
	
	@Test
	public void test006() {
		m.setCurrentx(8);
		int x = m.getCurrentx();
		assertEquals(8, x);
		assertNotSame(0, x);
	}
	
	@Test
	public void test007() {
		m.setCurrenty(7);
		int y = m.getCurrenty();
		assertEquals(7, y);
		assertNotSame(0, y);
	}
	
	@Test
	public void test008() {
		m.setCurrentx(8);
		m.setCurrenty(7);
		int x = m.getCurrentx();
		int y = m.getCurrenty();
		assertEquals(8, x);
		assertEquals(7, y);
	}
	

}
