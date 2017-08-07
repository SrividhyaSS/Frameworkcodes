package seleniumcommandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebContentPrinting {
	

	public static void main(String[] args) 
	{
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		// WebElement element = driver.findElement(By.tagName("td"));
		//System.out.println(element.getText());
		
		//WebElement element1 = driver.findElement(By.tagName("tr"));
	//	System.out.println(element1.getText());
		WebElement element2 = driver.findElement(By.tagName("tbody"));
		System.out.println(element2.getText());
		
		//System.out.println(element2.getAttribute("innerHTML"));
		
	}

}
