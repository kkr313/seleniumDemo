package TestSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Utility {
	

	public static WebDriver Initialize(String browser) {
		RemoteWebDriver driver = null;
		 switch (browser.toLowerCase()) {
         case "chrome":
        	 ChromeOptions browserOptions = new ChromeOptions();
        	 browserOptions.setPlatformName("Windows 10");
        	 browserOptions.setBrowserVersion("128");
        	 HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        	 ltOptions.put("username", "manjushree_patil");
        	 ltOptions.put("accessKey", "LT_DzzIHdqrG7OmpRPWkt7xc45qT89mCfIOvDFgNqu1YRyoqxk");
        	 ltOptions.put("project", "Lambdatest_SeleniumJava101");
        	 ltOptions.put("build", "Lambdatest_SeleniumJava101");
        	 ltOptions.put("name", "LambdaTestSelenium_101_Java");
        	 ltOptions.put("selenium_version", "4.0.0");
        	 ltOptions.put("w3c", true);
        	 ltOptions.put("network", true);
        	 ltOptions.put("video", true);
        	 ltOptions.put("visual", true);
        	 ltOptions.put("console", true);
        	 browserOptions.setCapability("LT:Options", ltOptions);
        	 try {
				driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"),browserOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             break;
         case "firefox":
             FirefoxOptions options = new FirefoxOptions();
             options.setPlatformName("Windows 11");
             options.setBrowserVersion("130.0");
        	 HashMap<String, Object> ltOptions1 = new HashMap<String, Object>();
        	 ltOptions1.put("username", "manjushree_patil");
        	 ltOptions1.put("accessKey", "LT_DzzIHdqrG7OmpRPWkt7xc45qT89mCfIOvDFgNqu1YRyoqxk");
        	 ltOptions1.put("project", "Lambdatest_SeleniumJava101");
        	 ltOptions1.put("build", "Lambdatest_SeleniumJava101");
        	 ltOptions1.put("name", "LambdaTestSelenium_101_Java");
        	 ltOptions1.put("selenium_version", "4.0.0");
        	 ltOptions1.put("w3c", true);
        	 ltOptions1.put("network", true);
        	 ltOptions1.put("video", true);
        	 ltOptions1.put("visual", true);
        	 ltOptions1.put("console", true);
        	 options.setCapability("LT:Options", ltOptions1);
        	 try {
 				driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"),options);
 			} catch (MalformedURLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
             break;
             
         case "edge":
        	 EdgeOptions edgeOptions = new EdgeOptions();
        	 edgeOptions.setPlatformName("macOS Ventura");
        	 edgeOptions.setBrowserVersion("127.0");
        	 HashMap<String, Object> ltOptions2 = new HashMap<String, Object>();
        	 ltOptions2.put("username", "manjushree_patil");
        	 ltOptions2.put("accessKey", "LT_DzzIHdqrG7OmpRPWkt7xc45qT89mCfIOvDFgNqu1YRyoqxk");
        	 ltOptions2.put("project", "Lambdatest_SeleniumJava101");
        	 ltOptions2.put("build", "Lambdatest_SeleniumJava101");
        	 ltOptions2.put("name", "LambdaTestSelenium_101_Java");
        	 ltOptions2.put("selenium_version", "4.0.0");
        	 ltOptions2.put("w3c", true);
        	 ltOptions2.put("network", true);
        	 ltOptions2.put("video", true);
        	 ltOptions2.put("visual", true);
        	 ltOptions2.put("console", true);
        	 edgeOptions.setCapability("LT:Options", ltOptions2);
        	 try {
  				driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"),edgeOptions);
  			} catch (MalformedURLException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
             break;
         case "internetexplorer" :
        	 InternetExplorerOptions ieoptions = new InternetExplorerOptions();
        	 ieoptions.setPlatformName("Windows 10");
        	 ieoptions.setBrowserVersion("11");
        	 HashMap<String, Object> ltOptions3 = new HashMap<String, Object>();
        	 ltOptions3.put("username", "manjushree_patil");
        	 ltOptions3.put("accessKey", "LT_DzzIHdqrG7OmpRPWkt7xc45qT89mCfIOvDFgNqu1YRyoqxk");
        	 ltOptions3.put("project", "Lambdatest_SeleniumJava101");
        	 ltOptions3.put("build", "Lambdatest_SeleniumJava101");
        	 ltOptions3.put("name", "LambdaTestSelenium_101_Java");
        	 ltOptions3.put("selenium_version", "4.0.0");
        	 ltOptions3.put("w3c", true);
        	 ltOptions3.put("network", true);
        	 ltOptions3.put("video", true);
        	 ltOptions3.put("visual", true);
        	 ltOptions3.put("console", true);
        	 ltOptions3.put("nativeEvents", false);
        	 ieoptions.setCapability("LT:Options", ltOptions3);
        	 try {
   				driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"),ieoptions);
   			} catch (MalformedURLException e) {
   				// TODO Auto-generated catch block
   				e.printStackTrace();
   			}
             break;
                  default:
             throw new IllegalArgumentException("Browser not supported: " + browser);
     }
		return driver;
	}
	
	
}
