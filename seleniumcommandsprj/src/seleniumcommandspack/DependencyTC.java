package seleniumcommandspack;



import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTC {
 
	@Test
  
  public void Login () 
  
  {
		Assert.assertEquals("elenium", "selenium");
		System.out.println("Login Successful");
		
  }
	
	
	@Test (dependsOnMethods = "Login") // it is depends on login method, if login fails dependency methods are skipped / not run.
	
	public void accountcreation ()
	{
		System.out.println("Accout has been created successfully");
	}
	
@Test (dependsOnMethods = {"Login", "accountcreation"}) // put in the {} in case of more than 1 method calling
	
	public void accountTransaction ()
	{
		System.out.println("accountTransaction is done");
	}
	
	
}
