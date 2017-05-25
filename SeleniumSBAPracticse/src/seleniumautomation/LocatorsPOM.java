package seleniumautomation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class LocatorsPOM {
	
	WebDriver driver;
	
	// Identify the Locators
	
	// Start practicing-SimpleDemo
	

	By EnterMessage = By.xpath("//*[@id=user-message]");
	
	By showmessage = By.xpath("//*[@id='get-input']/button");
	
public LocatorsPOM (WebDriver driver)
{
	driver = this.driver;
	
}

// Create methods for POM based model


	
public LocatorsPOM Singleinputfiled (String MSG) throws Exception
{
	Thread.sleep(5000);
	driver.findElement(EnterMessage).sendKeys(MSG);
	driver.findElement(showmessage).click();
	return this;
}


// Alert Handling

public LocatorsPOM AlertHandling ()
{
	driver.findElement(EnterMessage).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	alert.dismiss();
	alert.sendKeys("testing");
	String actual_msg = driver.switchTo().alert().getText();
	System.out.println("Expected message : "+actual_msg);
	return this;
	
}

// DatePicker

public LocatorsPOM datepicker ()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('datepicker1').value='09/09/2017'");
	return this;
}

// MouseHover

public LocatorsPOM MouseHover ()
{
	WebElement ele = driver.findElement(EnterMessage);
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	return this;
}

	// drop down selection

public LocatorsPOM dropdownjs ()
{
	Select listbox = new Select (driver.findElement(EnterMessage));
	listbox.selectByIndex(2);
	return this;
	
}
	// BootStramp Drop Down

public LocatorsPOM bootstrampdropdown ()
{
	List <WebElement> dropdown = driver.findElements(EnterMessage);
	for (WebElement element :dropdown)
	{
		String innerhtml = element.getText();
		if (innerhtml.equals("selenium"))
		{
			element.click();
			break;
		}
	}
	return this;
	
}
	
}
	




