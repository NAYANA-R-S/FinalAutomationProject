package test;

import org.testng.annotations.Test;

import pages.Homepage;

public class Homepagetest extends Baseclass {
	@Test
	public void testhomepage() throws InterruptedException
	{
		Homepage hp = new Homepage(driver);
		hp.categories();
		hp.shoe();
		hp.setvalue("mel.brooks+1@gmail.com", "Test@123");
		hp.login();
		
	}

}
