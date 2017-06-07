package runs;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frames.MethodsforLogin;

public class Loginwithparameters extends TestBaseforBrowserlauch

{

	@Parameters ({"username","password"})
	@Test (priority = 1)
	
	public void loginwithvalid (String username, String password ) throws Exception
	{
		new MethodsforLogin(driver)
		.Login(username, password);
		
		
	}
	
	

	
}
