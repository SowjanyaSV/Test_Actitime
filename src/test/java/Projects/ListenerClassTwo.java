package Projects;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Projects.Llisterner.class)

public class ListenerClassTwo {
	
	@Test
	
	public void test() {
		System.out.println("This is test()");
	}
	@Test
	
	public void access() 
	
	{
		System.out.println("This is access()");
		//assertTrue(false);
	}
	

}
