package seleniumcommandspack;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderevernt {
	
	public static void main (String args[]) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		/*driver.get("http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");*/
		
		JavascriptExecutor js= (JavascriptExecutor)driver; // enter values in date using javascript executor - simple one
		js.executeScript("document.getElementById('from').value='09-09-2017'");
		js.executeScript("document.getElementById('to').value='09-09-2017'");
		
		
		/*driver.findElement(By.xpath(".//*[@id='sandbox-container1']/div/input")).sendKeys("19/09/2012");*/
		
				
	}

}
