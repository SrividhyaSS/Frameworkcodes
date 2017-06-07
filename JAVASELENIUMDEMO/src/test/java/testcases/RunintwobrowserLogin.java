package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;
import utility.ExtentBaseClass;
import factory.Dataproviders;

public class RunintwobrowserLogin 
{
	
	WebDriver driver;
	static ExtentReports report;
	 static ExtentTest logger;
	
 
  
  @Parameters ("browser")
  @BeforeMethod
  public void Browseropen (String browsername) 
  {
	  
	  if (browsername.equalsIgnoreCase("chrome"))
	  {
		 
		  DesiredCapabilities cap = DesiredCapabilities.chrome();
		  cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		  report = ExtentBaseClass.GetExtent();
		  logger = report.startTest("Login TC", "SMOKE TEST CASE Logs");
		  logger.log(LogStatus.INFO, "Browser", "Browser open");
		  System.setProperty("webdriver.chrome.driver", Dataproviders.getConfig().getchromepath());
		  driver=new ChromeDriver();
	  }
	  else if (browsername.equalsIgnoreCase("ie"))
	  {
		  
		 System.setProperty("webdriver.ie.driver",Dataproviders.getConfig().getIEPath());
		 driver=new InternetExplorerDriver();
		  
	  }
		  
	  	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Dataproviders.getConfig().getApplicationUrl());
		logger.log(LogStatus.INFO, "Apps", "Application up and running"); 
	  
	  
  }
  
  
  @Test
  public void Loginapp () 
  {
	  
	  LoginPage login = PageFactory.initElements(driver,LoginPage.class);
	 login.loginApplication(Dataproviders.getExcel().getdata(0, 0, 0),Dataproviders.getExcel().getdata(0, 0, 1));
	 logger.log(LogStatus.INFO, "Login", "Login into the application"); 
  }

  @AfterMethod
  public void Browserclose ()
  {
	  driver.close();
  }

}
