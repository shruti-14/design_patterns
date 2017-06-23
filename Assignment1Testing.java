import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Assignment1Demo.NoSickLeave;
import Assignment1Demo.Onboarding;

public class Assignment1Testing {

	@Before
	public void testArrayList() {
		//fail("Not yet implemented");
		
	Onboarding arraylist = new Onboarding();
	assertNotNull(arraylist.getEmployee_List());
	
	}	
	
	@Test
	public void testStrategy()
	{
		NoSickLeave ns = new NoSickLeave();
		assertEquals(500,ns.updateSickLeave(0));
	}
}
