package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.Search;

public class Testcasesearch extends Base {
	
	
public Search sh;
@Test
public void searctest() throws InterruptedException, IOException {
	driver.get(url);
	Thread.sleep(3000);
	sh=new Search(driver);

	sh.entername("crop");
	Thread.sleep(3000);

	sh.clicksearchbutton();
	Thread.sleep(3000);
	 sh.cleartextbox();
	Thread.sleep(3000);

   sh.entername("plant");
   Thread.sleep(3000);

   sh.clicksearchbutton();
   Thread.sleep(3000);
   sh.cleartextbox();
}

}
