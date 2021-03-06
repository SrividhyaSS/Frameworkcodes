package runs;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import frames.Utilityclassfortakingscreenshot;

public class VerifyPageTitle extends LoginTest {
	

	
  
@Test 
  public void VerifyPageTitleTC () 
  {
	
	 
		 logger.log(LogStatus.INFO,"Title page verification is started"); 
		String Actual_Title = driver.getTitle();
		 System.out.println("print the actual title is :"+Actual_Title);
		 Utilityclassfortakingscreenshot.TakingScreenShopts(driver, "PageTitle");
		 Assert.assertTrue(Actual_Title.contains("welcome"));
		 logger.log(LogStatus.INFO,"Title page verification ends");
		 
		 
		 
		  
		  
	  }
	}
	 


	 
	  
	  

