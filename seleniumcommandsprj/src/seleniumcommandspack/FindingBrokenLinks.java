package seleniumcommandspack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindingBrokenLinks
{
	public static void main(String[] args) 
		{
		WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://testleaf.herokuapp.com/pages/Link.html");
	 driver.manage().window().maximize();
	 List<WebElement> listbrokenlinks = driver.findElements(By.tagName("a"));
	 System.out.println("print the number of links available in the site : " +listbrokenlinks.size());
	 
	 for (int i=0; i<listbrokenlinks.size(); i++)
	 {
		 WebElement ele = listbrokenlinks.get(i);
		 String url = ele.getAttribute("href");
		 verifyLinkActive(url);
		 
		 				

	}

		
		}

	private static void verifyLinkActive(String linkUrl) 
	
	{
		try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
		
	}
}

	

