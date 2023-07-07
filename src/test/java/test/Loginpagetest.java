package test;

import org.testng.annotations.Test;

import pages.Loginpage;

public class Loginpagetest extends Baseclass{
	
	@Test
	public void testloginpage() 
	{
		Loginpage lp = new Loginpage(driver);
	
		lp.log();
		lp.name("Melissa", "Brooks");
		lp.setvalue(RandomSequenceGenerator.randomMail(4), "9234567890");
		lp.set();
		lp.setpass("Test@123", "Test@123");
		lp.create();
		
	}
	

}
