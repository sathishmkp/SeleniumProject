package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	String name = "Sathish";
	@Test
	public void checkValue() {
		
		Assert.assertEquals(name, "Sathish");
		
	   
	    	
	   
	}
	
	

}
