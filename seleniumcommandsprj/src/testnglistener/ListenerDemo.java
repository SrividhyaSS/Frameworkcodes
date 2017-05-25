package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;



public class ListenerDemo implements ITestListener

{
  @Test
  
  public void f()
  {
	  
  }

@Override
public void onFinish(ITestContext result) {
	
	
}

@Override
public void onStart(ITestContext result) {

	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
}

@Override
public void onTestFailure(ITestResult result) 
{

	System.out.println("Testcase is failed and test case details are : " +result.getName()); // get name  - it will store the corresponding method name //
}

@Override
public void onTestSkipped(ITestResult result)
{

System.out.println("Test case is skipped and test case details are : " +result.getName());	
}

@Override
public void onTestStart(ITestResult result) {
	
	
}

@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("Test case is passed and test case details are : " +result.getName());
	
}


}

