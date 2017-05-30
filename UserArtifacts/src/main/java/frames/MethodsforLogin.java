package frames;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MethodsforLogin extends ObjectFileReader
{

	WebDriver driver;

	public MethodsforLogin(WebDriver driver) throws IOException 
	
	{
	
		this.driver = driver;
		
		
	}

		
	
	public MethodsforLogin Login (String UID, String PWD)
	{
		
		driver.findElement(By.name(pro.getProperty("username_field_by_name"))).sendKeys(UID);
		driver.findElement(By.name(pro.getProperty("password_field_by_name"))).sendKeys(PWD);
		driver.findElement(By.name(pro.getProperty("login_filed_by_name"))).click();
		return this;
		
	}
}



