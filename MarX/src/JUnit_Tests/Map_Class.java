package JUnit_Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	Map_Get_Set.class,
	Map_Move.class,
	Map_Size.class
})

public class Map_Class {

}
