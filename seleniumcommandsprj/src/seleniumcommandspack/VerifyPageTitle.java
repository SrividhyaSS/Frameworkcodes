package seleniumcommandspack;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	
	WebDriver driver;
	@Test()
	public void VerifyPageTitleofthissite ()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		//Type 1
		
		String mytitle = driver.getTitle();
		System.out.println("Print the title name : "+mytitle);
		
		String Expected_Title = "Welcome: Mercury Tours!";
		Assert.assertEquals(mytitle, Expected_Title);
		
		System.out.println("Test is passed");
		
		//Type 2
		
		// Assert.assertEquals("String is matched","Welcome: Mercury Tours", "Welcome: Mercury Tours");
		
	}

}
