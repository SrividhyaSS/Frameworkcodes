package seleniumcommandspack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropFunctions {

	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		
		//find element which we need to drag
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//find element which we need to drop
		WebElement drop = driver.findElement(By.id("droppable"));
		
		
		//create Actions class
		Actions act = new Actions (driver);
		
	
		//  this will drag element to destination
		act.dragAndDrop(drag, drop).build().perform();
		
		// print the results
		System.out.println("drag and drop is successful");
		
		
		
	
	}

}
