package JUnit_Tests;

import static org.junit.Assert.*;
import com.testing.junit.Map;
import org.junit.Test;

public class Map_Move {
	Map m = new Map(10, 10);

	// Moving North
	
	@Test
	public void test001() {
		m.move("N");
		int y = m.getCurrenty();
		assertSame(1, y);
	}
	
	@Test
	public void test002() {
		m.move("N");
		m.move("N");
		m.move("N");
		m.move("N");
		m.move("N");
		int y = m.getCurrenty();
		assertSame(5, y);
	}
	
	// Moving South
	
	@Test 
	public void test003() {
		m.move("S");
		int y = m.getCurrenty();
		assertSame(10, y);
	}
	
	@Test 
	public void test004() {
		m.move("S");
		m.move("S");
		m.move("S");
		m.move("S");
		m.move("S");
		m.move("S");
		m.move("S");
		int y = m.getCurrenty();
		assertSame(4, y);
	}
	
	// Moving East
	
	@Test
	public void test005() {
		m.move("E");
		int x = m.getCurrentx();
		assertSame(1, x);
	}
	
	@Test
	public void test006() {
		m.move("E");
		m.move("E");
		m.move("E");
		m.move("E");
		m.move("E");
		int x = m.getCurrentx();
		assertSame(5, x);
	}
	
	// Moving West
	
	@Test 
	public void test007() {
		m.move("W");
		int x = m.getCurrentx();
		assertSame(10, x);
	}
	
	@Test 
	public void test008() {
		m.move("W");
		m.move("W");
		m.move("W");
		m.move("W");
		m.move("W");
		m.move("W");
		m.move("W");
		int x = m.getCurrentx();
		assertSame(4, x);
	}
	
	@Test
	public void test009() {
		m.move("N");
		m.move("N"); 
		m.move("W"); 
		m.move("W"); 
		m.move("N"); 
		m.move("E"); 
		m.move("S"); 
		m.move("S");
		m.move("S");
		m.move("S");
		m.move("S"); 
		m.move("E"); 
		m.move("E");
		m.move("E"); 
		int x = m.getCurrentx();
		int y = m.getCurrenty();
		assertSame(2, x);
		assertSame(9, y);
	}

}
