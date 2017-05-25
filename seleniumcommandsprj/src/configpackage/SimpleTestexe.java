package configpackage;

import org.testng.annotations.Test;

public class SimpleTestexe extends BaseClassforBrowserHandling
{
  @Test 
  
  public void Verifypagetile () 
  {
	  
	 String title =  driver.getTitle();
	  System.out.println("print the page title : " +title);
  }
}
