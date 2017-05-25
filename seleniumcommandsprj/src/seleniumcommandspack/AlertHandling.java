package seleniumcommandspack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException 
	{
	
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

Alert alert = driver.switchTo().alert(); // Switching to Alert using reference variable
Thread.sleep(3000);

String Alert_msg = driver.switchTo().alert().getText(); // Get and print alert text
System.out.println("The Alert message is:" +Alert_msg);

alert.sendKeys("HELLO"); // enter text in the alert box
driver.switchTo().alert().accept(); // accept alert
Thread.sleep(3000);

driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")).click();
Thread.sleep(3000);
alert.dismiss(); // dismiss the alert

	}


}
