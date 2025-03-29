package TestSelenium;	

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import TestSelenium.BaseClass;
//import TestSelenium.TestScenarioPage;


public class TestScenarios extends BaseClass{

	WebDriver driver;
	SoftAssert softassert;
	TestScenarioPage scenariopage;

	public TestScenarios() {
		softassert = new SoftAssert();
	}

	
	@Test(priority=1)
	public void validateMessage() {
		scenariopage = new TestScenarioPage();
		String welcome = "Welcome to LambdaTest";
		boolean urlvalidate = scenariopage.getSiteURL();
		softassert.assertEquals(urlvalidate, true,"URL does not match");
		String welcomevalidate = scenariopage.checkMessage(welcome);
		softassert.assertEquals(welcomevalidate, welcome, "Message does not match");
	}
	
	@Test(priority=2)
	public void validateDragDrop() {
		scenariopage = new TestScenarioPage();
		String slidevalue = scenariopage.checkSlider();
		softassert.assertEquals(slidevalue, "95", "Slide value does not match");
	}
	
	@Test(priority=3)
	public void validateFormdEmo() {
		scenariopage = new TestScenarioPage();
		String validationmsg = scenariopage.checkFormValidation();
		softassert.assertEquals(validationmsg, "Please fill out this field.", "Validation message does not match");
		String successmsg = scenariopage.checkFormSubmission();
		softassert.assertEquals(successmsg, "Thanks for contacting us, we will get back to you shortly.", "Success message does not match");
	}
	
	
}
