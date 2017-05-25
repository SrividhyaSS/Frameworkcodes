package seleniumautomation;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001 extends Baseclass {
  @Test (dataProvider = "ReadExcelData")
  
  
  public void SimpleDemo () throws Exception 
   {
	  Reporter.log("SimpleDemo-Started", true);
	  
	 new LocatorsPOM(driver)
	 .Singleinputfiled("Srividhya");
		 
	  Reporter.log("SimpleDemo-completed", true);
	Utility.TakeScreenshots(driver, "Takescreenprint1");
  }
  
  @DataProvider (name = "ReadExcelData")
  public Object [][] passdata()
  {
	  ReadExcelData config = new ReadExcelData();
	  int rows = config.getrowcount(0);
	  Object [][] data = new Object [rows][2];
	  for (int i=0; i<rows; i++)
	  {
		  data [i][0] = config.getdata(0,i,0);
		  data [i][0] = config.getdata(0, i, 1);
		  
		  }
	return data;
  }
}
