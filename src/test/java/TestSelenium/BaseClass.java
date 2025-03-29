package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//import TestSelenium.DriverManager;
//import TestSelenium.Utility;

public class BaseClass {
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters({"browser"})
	public void launchBrowser(String browser) {
		driver = Utility.Initialize(browser);
		DriverManager.setWebDriver(driver);
//		this.driver = WebDriverManager.getDriver();
	}
	
	@BeforeMethod
	@Parameters({"URL"})
	public void getURL(String url) {
		driver.get(url);
	}
	
	@AfterTest
	public void endTest() {
		driver.quit();
	}

}
