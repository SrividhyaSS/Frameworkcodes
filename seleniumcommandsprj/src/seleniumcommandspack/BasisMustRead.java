package seleniumcommandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasisMustRead 
{
		
public static void main (String [] args)
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	// How to open url
	
	driver.get("http://newtours.demoaut.com/");
	
	// check page is loaded completely or not //
	
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("return document.readyState").toString().equals("complete");
	  System.out.println("Page Is loaded.");
		   
    
	 // driver.navigate().to("http://newtours.demoaut.com/");
	
	// how to maximize. // minimize is not possible
	
	// driver.manage().window().maximize();
	
	
	// browser specific location using setposition
	
//	Point p = new Point(0, 100); // point class is available in selenium org.openqa package //
//	driver.manage().window().setPosition(p); 
	
	// Resize the browser using set size
	
	//Dimension d = new Dimension(100, 100);
	//driver.manage().window().setSize(d);
	
	// get page source
	
	//String d1 = driver.getPageSource();
	//System.out.println(d1);
	
	driver.findElement(By.name("userName")).sendKeys("academy");
	System.out.println(driver.findElement(By.name("userName")).getAttribute("value"));
	
	driver.findElement(By.name("password")).sendKeys("academy");
	System.out.println(driver.findElement(By.name("password")).getAttribute("value"));
	
	driver.findElement(By.name("login")).click();
	driver.findElement(By.xpath("//input[@value = 'oneway']")).click();
	
	// .write a script to count no of options present in the listbox?
	
	WebDriverWait wait = new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("passCount"))));
	Select dropdown  = new Select (driver.findElement(By.name("passCount")));
	List <WebElement> options = dropdown.getOptions();
	int optioncount = options.size();
	for (int i=0; i<optioncount; i++)
	{
		String data = options.get(i).getText();
		System.out.println(data);
	}
	
	dropdown.selectByVisibleText("2");
	System.out.println("Drop down value is selected");
	
	
	
	
	
	//  print all option in list box in reverse order? 
	

	/* Select dropdown  = new Select (driver.findElement(By.name("passCount")));
	List <WebElement> options = dropdown.getOptions();
	for (int i = options.size()-1; i>=0; i--)
	{
		String data = options.get(i).getText();
		System.out.println(data);
	}*/
	
	// print option in sorted order
	
	/*Select dropdown  = new Select (driver.findElement(By.xpath("//select[@name='fromPort']")));
	List <WebElement> options = dropdown.getOptions();
	System.out.println(options);
	String msg = "Sorted";
	for (int i=0; i<options.size()-1; i++)
	{
		String s1 = options.get(i).getText();
		System.out.println(s1);
		String s2 = options.get(i).getText();
		System.out.println(s2);
	
	
	if (s1.compareTo(s2)>0)
	{
		msg = "NotSorted";
	}	
	System.out.println(msg);
	}*/
	

}


}







