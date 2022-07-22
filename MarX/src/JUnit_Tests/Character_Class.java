package JUnit_Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { 
	Character_Create.class,
	Character_Get_Set.class 
})

public class Character_Class {

}
