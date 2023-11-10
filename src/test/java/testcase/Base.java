package testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.readingdata;

public class Base {

readingdata  rd =new readingdata();

public String url=rd.getapplicationurl();
public String Email=rd.getEmail();
public String Name=rd.getName();
public String password=rd.setpassword();
public String loginemail=rd.getloginmail();

public static Logger logger;
public static WebDriver driver;

	
	
	@BeforeClass
	
	public void openApplication() {
		logger = Logger.getLogger("kalgudiinput");
		PropertyConfigurator.configure("log4j.properties");

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiki\\eclipse-workspace\\kalgudiinput\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        driver.get(url);
        
	}
		@AfterClass
		public void closeApplication() {
			driver.close();
		
	}
		public void captureScreen(WebDriver driver,String tname) throws IOException {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir")+"/screenshots/"+tname+".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screensht is taken");
		}
}
