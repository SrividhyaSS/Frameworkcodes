package configpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
	Properties pro;

	public  ConfigReader ()
	{
		
		try 
		{
			File src = new File ("D:\\SeleniumPractice\\srividhya\\seleniumcommandsprj\\Object_Repo.properties");
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
}


