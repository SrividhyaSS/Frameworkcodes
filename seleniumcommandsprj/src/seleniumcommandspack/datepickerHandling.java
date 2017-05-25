package seleniumcommandspack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		// Date using ID
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='09/09/2017'");
		
        // Date using CSS Selector
		
		/* JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('#datepicker1').value='09/09/2017'");*/
	}

}
