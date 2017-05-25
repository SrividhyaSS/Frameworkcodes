package seleniumcommandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapwithtwotable {

	public static void main(String[] args) { // not working
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		List<WebElement> DualList = (driver.findElements(By.xpath("//ul[@class='list-group']/li")));
		for (WebElement element : DualList)
		{
			String innerhtml = element.getText();
			System.out.println("Print the List values : "+innerhtml);
			if (innerhtml.equals("bootstrap-duallist"))
			{
				element.click();
				break;
				
			}
			
			driver.findElement(By.cssSelector(".btn.btn-default.btn-sm.move-right")).click();
			
		}

		/* for (WebElement element : DualList)
		{
			String innerhtml = element.getText();
			System.out.println("Print the List values : "+innerhtml);
			if (innerhtml.equals("Porta ac consectetur ac"))
			{
				element.click();
				break;
			}
	
	driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div[2]/button[1]")).click();*/
		}
	}


	
	
	


