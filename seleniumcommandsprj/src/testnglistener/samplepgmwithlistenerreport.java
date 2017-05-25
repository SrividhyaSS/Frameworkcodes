package testnglistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class samplepgmwithlistenerreport 
{
 WebDriver driver;
	@Test
  public void VerifypageTitle() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.get("http://www.seleniumeasy.com/test/");
	  driver.manage().window().maximize();
	  String Actual_Title = driver.getTitle();
	  System.out.println("print the actual title : " +Actual_Title);
	  
	  
  }
}
