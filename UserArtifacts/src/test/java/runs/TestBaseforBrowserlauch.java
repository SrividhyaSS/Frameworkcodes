package runs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;






import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import frames.ExtentBaseClass;
import frames.Methodforbrowser;



public class TestBaseforBrowserlauch
{

	
	 WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	// ExtentBaseClass logs = new ExtentBaseClass();
	 Methodforbrowser config = new Methodforbrowser();
	  
	 
	  @BeforeClass
	  @Parameters ("browser")
	  public void browserinitialisation (String browsername) 
	  {
		 
		  if (browsername.equalsIgnoreCase("chrome"))
		  {
			 
			  DesiredCapabilities cap = DesiredCapabilities.chrome();
			  cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			  
			
			  System.setProperty("webdriver.chrome.driver", config.getChromePath());
			  driver = new ChromeDriver ();
			  
			  
			
			 
			  }
		  
		  else if (browsername.equalsIgnoreCase("ie"))
		  {
			
			  System.setProperty("webdriver.ie.driver", config.getIEPath());
			  driver = new InternetExplorerDriver ();
		  }
		  
		  driver.manage().window().maximize();
		  driver.get(config.getApplicationURL());
		  
	  }

	  @AfterClass
	  public void browserclose ()
	  
	  {
		  report.flush();
		  driver.quit();
		
		 
		  
		  
	  }

	}