package seleniumcommandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TEXTBOXHANDLINGs 

{

	public static void main (String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
        JavascriptExecutor js = (JavascriptExecutor)driver;        
        js.executeScript("document.querySelector(\"input[placeholder='First Name']\").value='Krishna'");
		
		
		
		
	}
}
