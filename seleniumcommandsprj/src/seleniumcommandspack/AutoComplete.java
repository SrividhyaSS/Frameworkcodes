package seleniumcommandspack;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AutoComplete {
	
	WebDriver driver;
	WebDriverWait wait;

	String URL = "http://jqueryui.com/autocomplete/";
	private By frameLocator = By.className("demo-frame");
	private By tagText = By.id("tags");
	
  @Test
  public void Autocomplete () 
  {
	  
	    driver.navigate().to(URL);
		WebElement frameElement=driver.findElement(frameLocator);
		driver.switchTo().frame(frameElement);
		wait.until(ExpectedConditions.presenceOfElementLocated(tagText));
		WebElement textBoxElement = driver.findElement(tagText);
		textBoxElement.sendKeys("a");
		selectOptionWithText("Java");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver();
	
  }

  /*@AfterClass
  public void afterClass() 
  
  {
	  driver.close();
  }*/

  public void selectOptionWithText(String textToSelect) {
		try {
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}


