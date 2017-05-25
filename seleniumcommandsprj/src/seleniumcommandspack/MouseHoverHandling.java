package seleniumcommandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		// Code for mouse hover action
		
				
		WebElement ele = driver.findElement(By.xpath("//button[@class='dropbtn']")); // Find element on "AutomationTool"
		Actions act = new Actions(driver); // Call Action class to perform mouse hover actions
		act.moveToElement(ele).build().perform();
		
		//Code for selecting details from bootstrap drop down
		
		List<WebElement> dropdownlinks  = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		// find the whole web element details and store in web element list
		
		for (WebElement element : dropdownlinks) // declare the web element as element (object)
		{
			String innerhtml = element.getText(); // Store the gettext in "inner html" string if you want to print
			System.out.println("List the drodown details : "+innerhtml);
			if (innerhtml.equals("Appium"))
			{
				element.click();
				break;
			}
		}
		
	}

}
