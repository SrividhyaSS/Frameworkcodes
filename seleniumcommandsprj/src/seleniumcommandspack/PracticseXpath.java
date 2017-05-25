package seleniumcommandspack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticseXpath {

	public static void main(String[] args) 
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumChrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("academy");
	driver.findElement(By.name("password")).sendKeys("academy");
	driver.findElement(By.xpath(" //input[@name='login']")).click();
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	driver.findElement(By.xpath("//input[@value='Business']")).click();
	driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
	driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
	driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	String actual_gettitle = driver.getTitle();
	String expected_msg = "Book a Flight";
	Assert.assertTrue(actual_gettitle.contains(expected_msg));
	System.out.println ("Test Passed");
	
	
	
	
	
	
	
	
	

	}

}
