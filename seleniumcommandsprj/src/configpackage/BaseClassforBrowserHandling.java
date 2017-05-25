package configpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClassforBrowserHandling {
 
	WebDriver driver;
	ConfigReader config = new ConfigReader();
  
  @BeforeClass
  @Parameters ("browser")
  public void Browserinitialisation (String browsername)
  {
	  
	  if (browsername.equalsIgnoreCase("chrome"))
	  {
		 
		  System.setProperty("webdriver.chrome.driver", config.getChromePath());
		  driver = new ChromeDriver ();
		  }
	  
	  else if (browsername.equalsIgnoreCase("ie"))
	  {
		
		  System.setProperty("webdriver.ie.driver", config.getIEPath());
		  driver = new InternetExplorerDriver ();
	  }
	  
	  
	
	  driver.get(config.getApplicationURL());
	  
  }

  @AfterClass
  
  public void BrowserClose ()
  
  {
	  
	  driver.quit();
  }

}
