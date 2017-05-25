package seleniumcommandspack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumRCexample { // selenium RC having node and hub concept and run node machine with different OS //
	
	@Test

	public void sampleRCprogram () throws MalformedURLException
	{
		DesiredCapabilities cap = DesiredCapabilities.chrome(); //  set desired capabilities of the node machine //
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL ("http://localhost:4444/wd/hub"); // have to mention hub url
		WebDriver driver = new RemoteWebDriver(url,cap); // have to use remote webdriver in case of selenium RC
		driver.get("https://jqueryui.com/ ");
		String Actual_Tile = driver.getTitle();
		System.out.println("print the title : " +Actual_Tile);
		
	}

}
