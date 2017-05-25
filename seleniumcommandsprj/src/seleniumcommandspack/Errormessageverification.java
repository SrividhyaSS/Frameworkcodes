package seleniumcommandspack;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Errormessageverification {

	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.yokibu.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='index-ctr']/div[1]/div[1]/a")).click();		// click on sign in
		
				
		driver.findElement(By.xpath("//*[@id='index-ctr']/div[1]/div[2]/div[2]/div[2]")).click(); // click on student
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/div/div[2]/form/div[4]/button")).click(); // click on sign in
		
		
		String Actual_msg = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/div/div[2]/form/div[1]/div/span")).getText(); 
		// Find error code Xpath and get the text value and store in Actual_msg
		
		String Expected_message = "Required field cannot be left blank"; // declare expected message
		
		 //Type 1
		// Assert.assertEquals(Actual_msg, Expected_message);
		
		// Type 2
		Assert.assertTrue(Actual_msg.contains(Expected_message));
		System.out.println("Error message is verified - passed");			
		
		
		

}
}

