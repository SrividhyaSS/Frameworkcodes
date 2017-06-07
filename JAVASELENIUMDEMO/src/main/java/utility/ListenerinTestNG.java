package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerinTestNG implements ITestListener
{
  @Test
  public void f() {
  }

public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult result) {
	
	System.out.println("Test case is failed and test case details are : "+result.getName());
	
}

public void onTestSkipped(ITestResult result) {
	
	System.out.println("Test case is skipped and test case details are : " +result.getName());	
	
}

public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result)
{
	System.out.println("Test case is success and test case details are : "+result.getName());
	
}
}
