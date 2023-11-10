package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.Registration;

public class testcaseregister extends Base{
	
	public Registration R;
	
	@Test
	public void logintest() throws InterruptedException, IOException {
		
		driver.get(url);
		logger.info("url is opened");
		Thread.sleep(3000);
		R= new Registration(driver);
		R.setEmail(Email);
		logger.info("eamil is entered");

		R.setName(Name);
		logger.info("name is entered");

		R.clickregisterbutton();
		logger.info("clicked");
	}
}
