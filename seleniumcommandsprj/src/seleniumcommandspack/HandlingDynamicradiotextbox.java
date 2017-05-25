package seleniumcommandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingDynamicradiotextbox {

	public static void main(String[] args)
	
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		// Dynamic Radio Buttons
		
		List<WebElement> Radio = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']")); // Storing 4 weblement
		
		for(int i=0;i<Radio.size();i++) // looping with Radio (webelement) size
		{
			WebElement local_Radio = Radio.get(i); // it will get the webelement and store in local_Radio
			String Attribute_value = local_Radio.getAttribute("value"); // why we called get attribute as "value". it is taken from html tag "value"
			System.out.println("values from Radio Buttons are : " +Attribute_value);
			
			if(Attribute_value.equalsIgnoreCase("RUBY"))
			{
				local_Radio.click();
				break;
			}
		}
				
		// Dynamic Checkbox
		
		List<WebElement> CheckBoxs = driver.findElements(By.xpath("//input[@type='checkbox']")); // List the all webelemnt of checkbox
		
		for (int i=0; i<CheckBoxs.size();i++)
		{
			WebElement local_Checkboxs = CheckBoxs.get(i); // store the one weblement of check box in i using for loop
			System.out.println("print the xpathof 1 :" +local_Checkboxs); // print the i , it is having xpath id
			String CheckBoxs_Value = local_Checkboxs.getAttribute("id"); // using id, get the value of checkbox and store . 
			System.out.println("List the checkbox :" +CheckBoxs_Value); // print the value
			
			if (CheckBoxs_Value.equalsIgnoreCase("Code")) // using if loop, click the necessary check box
			{
				local_Checkboxs.click();
				break;
			}
	
			
			
		}
		
		

	}

}
