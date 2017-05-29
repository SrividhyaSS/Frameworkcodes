package seleniumcommandspack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.opera.core.systems.internal.input.KeyEvent;

public class Uploadusingrobot { 
	
	WebDriver driver;
	
	@Test
	
	

	public void FileUploading () throws AWTException, Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='input-4']")).click(); // click is not working. will see later // 
		
		// copy the file to clipboard
		
		String str = "D:\\SeleniumUpload\\sample.txt";
		Toolkit kit = Toolkit.getDefaultToolkit();
		Clipboard clip = kit.getSystemClipboard();
		StringSelection strsel = new StringSelection(str);
		clip.setContents(strsel,null);
		
		// ROBOT class actions

		Robot robo = new Robot();
		robo.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robo.keyPress(java.awt.event.KeyEvent.VK_V);
		robo.keyRelease(java.awt.event.KeyEvent.VK_V);		
		robo.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robo.keyPress(java.awt.event.KeyEvent.VK_TAB);
        robo.keyPress(java.awt.event.KeyEvent.VK_TAB);
        robo.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	


	}

}
