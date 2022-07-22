package JUnit_Tests;

import static org.junit.Assert.*;
import com.testing.junit.Map;
import org.junit.Test;

public class Map_Size {
	Map m = new Map(10, 10);

	@Test
	public void test001() {
		assertNotNull(m);
	}

}
