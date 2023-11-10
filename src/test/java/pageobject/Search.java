package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	public WebDriver driver;
	public Search(WebDriver driver) {
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement search;

	@FindBy(xpath="//div[@class='search-btn']")
	WebElement searchbutton;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement cleartext;
	public void entername(String text) {
		search.sendKeys(text);
	}
	public void clicksearchbutton() {
		searchbutton.click();
	}
		public void cleartextbox() {
			cleartext.clear();
		}
}
