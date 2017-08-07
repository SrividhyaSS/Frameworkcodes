package seleniumcommandspack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler {

	public static void main (String args []) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	driver.findElement(By.linkText("Follow Twitter & Facebook")).click();
	  Thread.sleep(3000);
	  
	System.out.println(driver.getWindowHandles()); // print how many windows are open
	
	String parentWindow = driver.getWindowHandle(); // get parent reference
	
	Set<String> handles =  driver.getWindowHandles();  // compare parent and child windows
	
	ArrayList <String> tabs = new ArrayList <>(handles); // convert set to array list 
	
	driver.switchTo().window(tabs.get(1)); // using index we can convert to window and perform action on that and close it //
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	driver.switchTo().window(tabs.get(0));
	
	driver.close();
	
	
	
	
	/* for(String windowHandle  : handles)
    {
    if(!windowHandle.equals(parentWindow))
       {
       driver.switchTo().window(windowHandle);
       Thread.sleep(5000);
   	         driver.close(); 
      driver.switchTo().window(parentWindow);
       }
	}
	} */
}

}

