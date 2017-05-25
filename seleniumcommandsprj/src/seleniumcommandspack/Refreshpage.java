package seleniumcommandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Refreshpage {

	WebDriver driver;
	@Test()
	public void Refreshthepage ()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		// refresh page by Type 1
		
		driver.navigate().refresh();
		System.out.println("Page is refreshed by Type 1");
		
		// refresh page by Type 2
		
		driver.findElement(By.name("userName")).sendKeys(Keys.F5);
		System.out.println("Page is refreshed by Type 2");
		
		
}
}

