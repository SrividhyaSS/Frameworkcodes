package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import factory.BrowserFactory;
import factory.Dataproviders;

public class Log4jTestcase {
	
	WebDriver driver;
	Logger logger=Logger.getLogger("Log4jTestcase");
	

	 @BeforeMethod
	  public void SetUP()
	  {
		 PropertyConfigurator.configure("D:/GIT-codes/JAVASELENIUMDEMO/src/main/resources/log4j.properties");
		  driver = BrowserFactory.getBrowser("chrome");
		  logger.info("Browser Opened");
	      driver.get(Dataproviders.getConfig().getApplicationUrl());
	      logger.info("Url opened");
		  
		  
	  }
	
  @Test
  public void LoginTestcase () 
  {
  
	  LoginPage login = PageFactory.initElements(driver,LoginPage.class);
	 login.loginApplication(Dataproviders.getExcel().getdata(0, 0, 0),Dataproviders.getExcel().getdata(0, 0, 1));
	 logger.info("Login successful");
	
	
	 	  
	  
  }
  
  @AfterMethod
  public void TearDown()
  {
	  
	BrowserFactory.closeBrowser(driver);
	 logger.info("browser closed");
		
  }
}
