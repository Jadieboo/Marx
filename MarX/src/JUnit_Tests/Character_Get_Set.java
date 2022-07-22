package JUnit_Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.testing.junit.Character;

public class Character_Get_Set {
	Character c = new Character("Jade", 50, 0, "Faery");
	
	@Test
	public void test001() {
		c.setName("Nezorath");
		String player = c.getName();
		assertEquals("Nezorath", player);
	}
	
	@Test
	public void test002() {
		c.setEnergy(600);
		int nrg = c.getEnergy();
		assertEquals(600, nrg);
	}
	
	@Test
	public void test003() {
		c.setAlignment(5);
		int algnmnt = c.getAlignment();
		assertEquals(5, algnmnt);
	}
	
	@Test
	public void test004() {
		c.setType("Dragon");
		String species = c.getType();
		assertEquals("Dragon", species);
	}
}