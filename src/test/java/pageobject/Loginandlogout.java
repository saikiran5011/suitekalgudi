package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginandlogout {

	
	public WebDriver driver;
	
	public Loginandlogout(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement LoginEmail;
	
	
	@FindBy(xpath="//span[normalize-space()='Login with password']")
	WebElement Passwordbutton;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator input-data sys mb-10 mat-raised-button mat-button-base ng-star-inserted']")
	WebElement clicklogin;
	
	@FindBy(xpath="//mat-icon[normalize-space()='person']")
	WebElement person;

	@FindBy(xpath="//div[normalize-space()='Logout']")
	WebElement logout;
	public void setloginmail(String loginmail) {
		LoginEmail.sendKeys(loginmail);
	}
	public void clickpasswordbutton() {
		Passwordbutton.click();
	}
	public void setpassword(String pswd) {
		enterpassword.sendKeys(pswd);
	}
	public void loginbutton() {
		clicklogin.click();
	}
	public void clickPersonButton() {
	    person.click();
	}
	public void clickLogoutButton() {
	    logout.click();
	}
	
}
