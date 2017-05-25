package seleniumcommandspack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredcapabilityHandling
{
	WebDriver driver;
 @Test()
public void ChromeDesiredcapabilityHandling ()
	{
		
	 	DesiredCapabilities cap = DesiredCapabilities.chrome();
	 	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
	}

}




