package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Loginandlogout;

public class Testcaseloginandlogout extends Base {
	public Loginandlogout lp;
	
	@Test
	public void logintest() throws InterruptedException, IOException {
		
		driver.get(url);
		logger.info("url is opened");
		Thread.sleep(3000);		
		
		lp=new Loginandlogout(driver);
		lp.setloginmail(loginemail);
		logger.info("loginmail is enetered");
		Thread.sleep(3000);
		lp.clickpasswordbutton();
		logger.info("password is clicked");
		Thread.sleep(3000);
		lp.setpassword(password);
		logger.info("password is entered");
		Thread.sleep(3000);
		lp.loginbutton();
		logger.info("user logged in");
		Thread.sleep(3000);
	lp.clickPersonButton();
	logger.info("user clicked in");
	Thread.sleep(3000);
	lp.clickLogoutButton();
	logger.info("user logged out");
	Thread.sleep(3000);
	if(driver.getTitle().equals("Buy the best organic pro")) 
    {
		
		Assert.assertTrue(true);
		logger.info("the testcase is passed");
	System.out.println("the test case is passed");
	}else
	{
		captureScreen(driver,"loginTEST");
		
		Assert.assertTrue(false);
		logger.info("login test failed");
	}
		}
	
	}

