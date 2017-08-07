package seleniumcommandspack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm 
{

	static WebDriver driver;
	public static void main (String args[]) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.paytm.com");
		driver.findElement(By.linkText("Log In / Sign Up")).click();
	   Thread.sleep(3000);
		List<WebElement> noofiframes = driver.findElements(By.tagName("iframes"));
		System.out.println("print the no.of frames :"+noofiframes.size());
		//driver.switchTo().frame(0);
		
	}
} 
