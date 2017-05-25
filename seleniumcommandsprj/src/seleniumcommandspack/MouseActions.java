package seleniumcommandspack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Redbutton = driver.findElement(By.xpath("//div[@id='slider1']/div/input")); // Find path of webelement and store as an object
		Actions act = new Actions(driver); // Action class declaration
		act.clickAndHold(Redbutton).moveByOffset(85,0).release(Redbutton).build().perform(); //move the button x-axis 85 and release
		Thread.sleep(3000);
		act.clickAndHold(Redbutton).moveByOffset(-65,0).release(Redbutton).build().perform(); //move the button x-axis 65 and release

	}

}
