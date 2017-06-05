package runs;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import frames.ExcelDataConfiguration;
import frames.ExtentBaseClass;
import frames.MethodsforLogin;
import frames.Utilityclassfortakingscreenshot;

public class LoginTest extends TestBaseforBrowserlauch  
{
	
	  
  @Test (dataProvider = "ReadExcelData")
  public void Loginintotheapplication (String UID, String PWD) throws IOException 
  {
	  
	  report = ExtentBaseClass.GetExtent();
	  logger = report.startTest("Login", "Login-verification");
	  logger.log(LogStatus.INFO, "Login", "verified with valid credentials"); 
	  new MethodsforLogin(driver)
	 .Login(UID,PWD);
	  Utilityclassfortakingscreenshot.TakingScreenShopts(driver, "LoginPage");
	  logger.log(LogStatus.INFO,"Login", "Login verification is successfull");
	   report.endTest(logger);			  
  }
  
  @Test 
  
  public void titleverification ()
  {
	  
	  logger = report.startTest("Title", "Title-verification");
	  
	  logger.log(LogStatus.INFO, "Title", "Title-verification"); 
	  
	String Actual_Title =  driver.getTitle();
	System.out.println("print the title :"+Actual_Title);
	  
	  logger.log(LogStatus.INFO, "Title", "Title-verification"); 
	  
	  report.endTest(logger);	
  }
  
	  
	/*  @AfterMethod
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
		}*/
		
	
	 
  

	
	@DataProvider (name = "ReadExcelData") 
	public Object [][] passdata()
	{
		ExcelDataConfiguration config = new ExcelDataConfiguration("D:\\SeleniumExcelData\\TestData1.xlsx");
		int rows = config.getrowcount(0); // getting values of row in excel and stored in a int rows //
		System.out.println("print the number of rows : " +rows);
		Object data [][] = new Object [rows][2]; // this is the syntax of 2d array and mention the row / col details from excel, here row is taken as rows . and 2 is how many col in the excel //
		for (int i=0; i<rows;)
		{
						
			data [i][0] = config.getdata(0, 1, 0); // finding 1st row value //
		
			data [i][1] = config.getdata(0, 1, 1);  // finding 1st col value // then for loop will execute up to the row available in the sheet
			
			break;
		}
		
		return data;
	}
}

	
  

