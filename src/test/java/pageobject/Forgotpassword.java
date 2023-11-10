package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {

	public WebDriver driver;
	
	public  Forgotpassword (WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[contains(text(),'Forgotten your password?')]")
	WebElement forgoutpasswordlink;
	
	
	public void forgotpasswordbutton() {
		forgoutpasswordlink.click();
	}
	
}
