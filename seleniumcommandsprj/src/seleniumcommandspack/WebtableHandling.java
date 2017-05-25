package seleniumcommandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
	   WebElement table  = driver.findElement(By.xpath("//section[@class='innerblock']")); // Locate the entire table data
	   
	  List<WebElement> rows = table.findElements(By.tagName("tr")); // Print row count
      System.out.println("Row Count is : " +rows.size());
      
      List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));  // Print column count
     System.out.println("Coloumn count is : "+columns.size());
     
     System.out.println(rows.get(2).getText());  //print 2nd value
     
   System.out.println(rows.get(3).getText()); // Print col value 
   
     
      

	
	
		

	}

}
