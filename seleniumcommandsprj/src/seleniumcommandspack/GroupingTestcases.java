package seleniumcommandspack;

import org.testng.annotations.Test;

public class GroupingTestcases {
  
	@Test (groups = {"smokeTC"}) // we can create multiple group as well - @Test(groups={"group1","group2"}) //
  
  public void SmokeTestcases () 
	{
		System.out.println("smoke test cases has been executed");
  }
	
	@Test (groups = {"RegressionTC"})
	
	public void RegressionTestcases ()
	{
		System.out.println("Regression test case has been executed");
	}
	
	@Test 
	
	public void testcasedefault () // default is it enabled - true condition // 
	{
		System.out.println("By default test case is enabled");
	}
	
	@Test(enabled = false) // this test case will not execute because it is mentioned as enabled - false //
	public void disabletestcase ()
	{
		System.out.println("This is disabled test cases");
	}
	
}
