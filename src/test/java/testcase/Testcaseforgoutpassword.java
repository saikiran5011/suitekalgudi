package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.Forgotpassword;
import pageobject.Loginandlogout;

public class Testcaseforgoutpassword extends Base {
	public Forgotpassword fp;
	public Loginandlogout lp;
	@Test
	public void Forgotpassword() throws InterruptedException, IOException {
		driver.get(url);
		Thread.sleep(3000);
		fp=new Forgotpassword(driver);
		lp=new Loginandlogout(driver);
		lp.setloginmail(Email);
		Thread.sleep(3000);
		fp.forgotpasswordbutton();
		Thread.sleep(5000);
		logger.info("fprgotpswd page is opened");


	}

}
