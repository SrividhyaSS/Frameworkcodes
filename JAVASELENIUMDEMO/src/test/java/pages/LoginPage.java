package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 

{

	WebDriver driver;
	
	@FindBy (how=How.NAME,using="userName")
	@CacheLookup
	WebElement username;
	
	
	
	@FindBy (how=How.NAME,using="password")
	@CacheLookup
	WebElement pass;
	
	
	@FindBy (how=How.NAME,using="login")
	@CacheLookup
	WebElement login;
	
	
	
	public LoginPage (WebDriver ldriver)
	{
		this.driver = ldriver;
				
	}
	
	
	//@FindBy (name="UserName") WebElement User;
	
	
	//@FindBy (name="password") WebElement Pass;
	//@FindBy (name="login") WebElement LOGIN;
	
	public void loginApplication (String UID, String PWD)
	{
		username.sendKeys(UID);
		pass.sendKeys(PWD);
		login.click();
	
	}
	
	
}




