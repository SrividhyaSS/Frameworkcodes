package seleniumcommandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) { // not completed
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://testleaf.herokuapp.com/pages/frame.html");
	    driver.findElement(By.id("click"));
	    
	    
	    

	}

}
