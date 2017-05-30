package runs;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import frames.MethodsforLogin;

public class LoginTest extends TestBaseforBrowserlauch   {
	
	ExtentReports report;
	ExtentTest logger;
	  
  @Test
  public void Loginintotheapplication () throws IOException 
  {
	  report = new ExtentReports ("D:\\MAVENReports\\Report2.html");
	  logger = report.startTest("SMOKE TESTCASES");
	  logger.log(LogStatus.INFO,"Login is started");
	  new MethodsforLogin(driver)
	  .Login("academy", "academy");
	  logger.log(LogStatus.INFO,"Login is successfull");
  }
  
	  
	  @AfterMethod
		public void tearDown(ITestResult result) // capture screen shot for failed test case ITestResult is the interface by using screenshot results //
		{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		 
		 String screenshot_path=frames.Utilityclassfortakingscreenshot.TakingScreenShopts(driver, result.getName()); // calling utility class and screen shot name as method name //
		

		String image= logger.addScreenCapture(screenshot_path);
		
		logger.log(LogStatus.FAIL, "Title verification", image);
		 
		 
		}
		 
		report.endTest(logger);
		report.flush();
		 
		driver.get("D:\\MAVENReports\\Report2.html"); // screenshot also available in that report html // 
		}
		
	
	  
  
}
