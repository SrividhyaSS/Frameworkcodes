package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pages.LoginPage;
import factory.BrowserFactory;
import factory.Dataproviders;

public class VerifyLoginPage
{
	WebDriver driver;

  @BeforeMethod
  public void SetUP()
  {
	  
	  driver = BrowserFactory.getBrowser("chrome");
	  driver.get(Dataproviders.getConfig().getApplicationUrl());
	  
	  
  }
  
  
	
  @Test 
  public void LoginTestcase () 
  {
  
	  LoginPage login = PageFactory.initElements(driver,LoginPage.class);
	 login.loginApplication(Dataproviders.getExcel().getdata(0, 0, 0),Dataproviders.getExcel().getdata(0, 0, 1));
	
	 	  
	  
  }
  
   
  @AfterMethod
  public void TearDown()
  {
	  
	BrowserFactory.closeBrowser(driver);
  }

}
