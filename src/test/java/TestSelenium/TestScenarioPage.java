package TestSelenium;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScenarioPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//a[text()='Simple Form Demo']")
	private WebElement formdemo;
	
	@FindBy(xpath = "//h1[text()='Simple Form Demo']")
	private WebElement checksinglefield;
	
	@FindBy(id = "user-message")
	private WebElement messagefield;
	
	@FindBy(xpath="//button[@id='showInput']")
	private WebElement getcheckedbutton;
	
	@FindBy(xpath="//p[@id='message']")
	private WebElement checkmsg;
	
	//Scenario 2
	@FindBy(xpath="//a[text()='Drag & Drop Sliders']")
	private WebElement dragdrop;
	
	@FindBy(xpath="//h1[text()='Slider Demo']")
	private WebElement sliderdemo;
	
	@FindBy(xpath="//input[@class='sp__range'][@value='15']")
	private WebElement slider15;
	
	@FindBy(css="output#rangeSuccess")
	private WebElement slidervalue;
	
	//Scenario 3
	@FindBy(xpath="//a[text()='Input Form Submit']")
	private WebElement formsubmit;
	
	@FindBy(xpath="//h1[text()='Form Demo']")
	private WebElement inputformdemo;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='address_line1']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='address_line2']")
	private WebElement addressline2;
	
	@FindBy(xpath="//input[@id='inputState']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='zip']")
	private WebElement zipcode;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//p[@class='success-msg hidden']")
	private WebElement successmsg;
	
	
	
	public TestScenarioPage() {
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	
	public boolean getSiteURL() {
		boolean urlvalidate=false;
		String expectedURL = "simple-form-demo";
		formdemo.click();
		String actualURL=driver.getCurrentUrl();
		if(actualURL.contains(expectedURL)) {
			urlvalidate=true;
		}
		return urlvalidate;
	}

	public String checkMessage(String message) {
//		formdemo.click();
		wait.until(ExpectedConditions.visibilityOf(checksinglefield));
		messagefield.sendKeys(message);
		getcheckedbutton.click();
		String outputmessage = checkmsg.getText();
		return outputmessage;
	}
	
	public String checkSlider() {
		dragdrop.click();
		wait.until(ExpectedConditions.visibilityOf(sliderdemo));
		Actions actions = new Actions(driver);
		actions.moveToElement(slider15).clickAndHold().moveByOffset(215,0).release().perform();
		String rangevalue=slidervalue.getText();
		return rangevalue;
	}
	
	public String checkFormValidation() {
		String message = null;
		formsubmit.click();
		wait.until(ExpectedConditions.visibilityOf(inputformdemo));
		submit.click();
//		boolean isRequired = name.getAttribute("required").isEmpty();
		if(name.getAttribute("required")!=null) {
			message =name.getAttribute("validationMessage");
		}
		return message;
	}
	
	public String checkFormSubmission() {
		name.sendKeys("Samarjit");
		email.sendKeys("samarjitkundu99@gmail.com");
		pwd.sendKeys("Sam");
		company.sendKeys("Persistent");
		website.sendKeys("www.test1.com");
		city.sendKeys("Kolkata");
		address.sendKeys("Warje");
		addressline2.sendKeys("Katraj");
		state.sendKeys("West Bengal");
		zipcode.sendKeys("700065");
		Select select = new Select(country);
		select.selectByVisibleText("India");
		submit.click();
		return successmsg.getText();
	}
	
	
}
