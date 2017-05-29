package configpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfigReader 
{
	Properties pro;
	
	WebDriver driver;
	public  ConfigReader (WebDriver driver)
	{
		this.driver = driver;
		try 
		{
			File src = new File ("D:\\GIT-codes\\seleniumcommandsprj\\Object_Repo.properties");
			FileInputStream fis = new FileInputStream (src);
			pro=new Properties();
			pro.load(fis);
			
			
		} 
		
		
		catch (Exception e) {
			
			System.out.println("print the file error message : " +e.getMessage());
		}
		
	}
	
	
	public String getChromePath ()
	{
		String Path =  pro.getProperty("ChromeDriver");
		return Path;
		
	}
	
	public String getApplicationURL ()
	{
		String URL = pro.getProperty("URL");
		return URL;
	}
	
	public String getIEPath()
	{
		
		String path = pro.getProperty("IEDriver");
		return path;
	}
	
	
	
	public ConfigReader Login (String UID, String PWD)
	{
		driver.findElement(By.name(pro.getProperty("username_field_by_name"))).sendKeys(UID);
		driver.findElement(By.name(pro.getProperty("password_field_by_name"))).sendKeys(PWD);
		driver.findElement(By.name(pro.getProperty("login_filed_by_name"))).click();
		return this;
	
	}
	}



