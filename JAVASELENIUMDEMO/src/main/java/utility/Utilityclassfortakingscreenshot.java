package utility;

import java.io.File;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utilityclassfortakingscreenshot {

	
	public static String TakingScreenShots (WebDriver driver, String ScreenshotName)
	
	
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String des = "./Screenshots/"+ScreenshotName+".png"; // create "Screenshots" folder in this project, ScreenshotName - this is the dynamic name for the screen shot //
			File destination = new File(des);
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot is taken");
			return des;
		
			
		} catch (Exception e) {
			
			System.out.println("exception while taking screenshot :"+e.getMessage());
			return e.getMessage();
		}
		
	}
	
		
				
		public static String getCurrentDateTime()
		{
			DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			 
			 //get current date time with Date()
			 Date date = new Date();
			 
			 // Now format the date
			 String datenew= dateFormat.format(date);
			 
			 return datenew;
		}
		

	}



