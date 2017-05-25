package seleniumcommandspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotcalling {
	
	WebDriver driver;
	
	@Test()
	
	public void ScreenshotMethods () {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.getTitle();
		Utilityclassfortakingscreenshot.TakingScreenShopts(driver, "titlePage"); // screen shot calling. 
		
		
		
	

	}

}
