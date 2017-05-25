package seleniumcommandspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class AdvanceSeleniumReporting {
  WebDriver driver;
  ExtentReports report;
  ExtentTest logger;
 
  
	@Test
  public void VerifypageTitle () 
	{ 
		 report = new ExtentReports ("D:\\SeleniumExtentReports\\Report1.html"); // location to store the report with html foramt //
		 logger = report.startTest("Test1-VerifyTitle"); // any name for start test //
		 
		 logger.log(LogStatus.INFO,"Browser Started");
		 
		
		 
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		 driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/");
		 
		 logger.log(LogStatus.INFO,"App is up and running");
		 String Title = driver.getTitle();
		 System.out.println(Title);
		 Assert.assertTrue (Title.contains("Welcome: Mercury Tours1"));
		 
		 logger.log(LogStatus.PASS,"Title is verifed");
		 
	
		 
		 
  }
	
 @AfterMethod
	public void tearDown(ITestResult result) // capture screen shot for failed test case ITestResult is the interface by using screenshot results //
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	 
	 String screenshot_path=Utilityclassfortakingscreenshot.TakingScreenShopts(driver, result.getName()); // calling utility class and screen shot name as method name //
	

	String image= logger.addScreenCapture(screenshot_path);
	
	logger.log(LogStatus.FAIL, "Title verification", image);
	 
	 
	}
	 
	report.endTest(logger);
	report.flush();
	 
	driver.get("D:\\SeleniumExtentReports\\Report1.html"); // screenshot also available in that report html // 
	}
	
}
