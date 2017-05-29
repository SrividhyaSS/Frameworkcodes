package seleniumcommandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) { // not completed
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://testleaf.herokuapp.com/pages/frame.html");
	    
	    // finding number of frames in the page
	    
	    List<WebElement> frames = driver.findElements(By.id("wrapframe"));
	    System.out.println("print the no of frames :"+frames.size());
	  
	    // click on first frame
	    
	   WebElement frames1 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	   driver.switchTo().frame(frames1);
	   System.out.println("switch to the frame1");
	   driver.findElement(By.xpath("//*[@id='Click']")).click();
	   System.out.println("Hurray ! you clicked me");
	   driver.switchTo().defaultContent(); // return to the 
	   
	   //perform action on second frame
	   
	   WebElement frames2 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
	   driver.switchTo().frame(frames2);
	    System.out.println("switch to the frame2");
	     driver.findElement(By.id("Click1")).click();
	   System.out.println("Hurray ! you clicked me on frame 2");
	   
	   
	   
	   
	   
	    
	    
	    

	}

}
