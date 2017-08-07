package seleniumcommandspack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatapickerHandlindwithotherways {
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		WebElement calElement=driver.findElement(By.id("from"));
		calElement.click();
		selectDatefromMultiDate("31");
	}

	public  static void selectDatefromMultiDate(String date) 
	{
	
		By calendarXpath=By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"+date+"']");
		
		//By calendarXpath=By.xpath("table//td/a[text()='"+date+"']");
		
		driver.findElement(calendarXpath).click();
	}
		
		
	

	}


