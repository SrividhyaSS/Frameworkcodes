package seleniumautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility {
	
public  static void TakeScreenshots (WebDriver driver, String Takescreenprint)
{
	try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File ("./Screenshot/"+Takescreenprint+".png"));
		System.out.println("PRINT screen shot is taken");

	} 
	catch (IOException e) {
	
		e.printStackTrace();
	}
}

}
