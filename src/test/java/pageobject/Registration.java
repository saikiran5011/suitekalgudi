package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	public WebDriver driver;
	public Registration (WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	
	WebElement Email;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement Name;
	
	@FindBy(xpath ="//button[@class='mat-focus-indicator input-data sys mb-10 mat-flat-button mat-button-base']")
	WebElement Registerbutton;
	
	public void setEmail(String email) {
		Email.sendKeys(email);
	}
	public void setName(String name) {
		Name.sendKeys(name);
	}
	public void clickregisterbutton() {
		Registerbutton.click();
	}
}
