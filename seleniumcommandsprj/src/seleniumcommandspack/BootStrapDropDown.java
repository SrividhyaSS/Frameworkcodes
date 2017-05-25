package seleniumcommandspack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click(); // click on tutorial
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a")); // locate all the webelement list
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		for (WebElement element : menu)
				{
			String innerhtml = element.getText();
			System.out.println("print the inner HTML tags:"+innerhtml);
			if (innerhtml.contentEquals("About Us"))
			{
				element.click();
				break;
			}
			
			
		}	
		
	
	}

}
