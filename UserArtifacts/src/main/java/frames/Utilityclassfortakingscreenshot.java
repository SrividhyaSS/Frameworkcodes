package frames;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utilityclassfortakingscreenshot {

	
	public static String TakingScreenShopts (WebDriver driver, String ScreenshotName)
	
	
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String des = "D:/SeleniumPractice/srividhya/UserArtifacts/Screenshots/"+ScreenshotName+".png"; // create "Screenshots" folder in this project, ScreenshotName - this is the dynamic name for the screen shot //
			File destination = new File(des);
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot is taken");
			return des;
		
			
		} catch (Exception e) {
			
			System.out.println("exception while taking screenshot :"+e.getMessage());
			return e.getMessage();
		}
		
				
		
				
		
		

	}

}
