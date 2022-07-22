package JUnit_Tests;

import static org.junit.Assert.*;

import org.junit.Test;
import com.testing.junit.Character;

public class Character_Create {
	Character c = new Character("Jade", 10, 0, "Faery");

	@Test
	public void test001() {
		assertNotNull(c);
	}

}
