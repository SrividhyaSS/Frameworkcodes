package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Baseclass {
  
  WebDriver driver;
  @BeforeClass
  @Parameters ("browser")
   public void browserinitalisation (String browsername) {
	  
	  Reporter.log("*** Chrome Browser initalisation ***", true);
	  
	  
	  if (browsername.equalsIgnoreCase("chrome"))
			  {
		  			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		  			driver = new ChromeDriver ();
		  	  }
	  	    
	  else if (browsername.equalsIgnoreCase("ie"))
	  {
		  Reporter.log("*** IE Browser initalisation ***", true);
		  
		  System.setProperty("webdriver.ie.driver", "D:\\SeleniumIE\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver ();
		  
	  }
	  
	  Reporter.log("*** Window maximise ***", true);
	  
	  driver.manage().window().maximize();
	  
	  Reporter.log("*** Launch URL ***", true);
	  
	  driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
  }

 @AfterClass
  
  public void BrowserClose () {
	  
	  Reporter.log("*** Browser closed ***", true);
	  
	  driver.quit();
  }

} 
