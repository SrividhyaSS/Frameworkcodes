package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;
import utility.ExtentBaseClass;
import utility.Utilityclassfortakingscreenshot;
import factory.BrowserFactory;
import factory.Dataproviders;


public class VerifyLoginpagewithreport 
{

	WebDriver driver;
	static ExtentReports report;
	 static ExtentTest logger;

	  @BeforeMethod
	  public void  SetUP()
	  {
		 
		  report = ExtentBaseClass.GetExtent();
		  logger = report.startTest("Login TC", "SMOKE TEST CASE Logs");
		  logger.log(LogStatus.INFO, "Browser", "Browser open"); 
		  driver = BrowserFactory.getBrowser("chrome");
		  driver.get(Dataproviders.getConfig().getApplicationUrl());
		  logger.log(LogStatus.INFO, "Apps", "Application up and running"); 
		  
	  }
	  
	  
		
	  @Test
	  public void LoginTestcase () 
	  {
		
		 LoginPage login = PageFactory.initElements(driver,LoginPage.class);
		 login.loginApplication(Dataproviders.getExcel().getdata(0, 0, 0),Dataproviders.getExcel().getdata(0, 0, 1));
		 logger.log(LogStatus.INFO, "Login", "Login into the application"); 
		 Utilityclassfortakingscreenshot.TakingScreenShots(driver, "LoginPage");
		  
		  
		  
	  }
	  @AfterMethod
	  public void TearDown(ITestResult result)
	  {
		  
	 if(result.getStatus()==ITestResult.FAILURE)  
	 {
		 
		 String path = Utilityclassfortakingscreenshot.TakingScreenShots(driver, result.getName());
	 	logger.log(LogStatus.INFO, "FAIL","Test case is failed and screen shot is captured");
		logger.addScreencast(path);
	 		
	 }
	 
		 
		BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
	  }

	
	
}
