package frames;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentBaseClass 
{

	 static ExtentReports report;
	 static ExtentTest logger;

public static ExtentReports GetExtent(){
	 report = new ExtentReports ("D:\\MAVENReports\\Report4smoke.html");		
	return report;
}



public static ExtentTest createTest(String testName, String description){
	logger = report.startTest(testName, description);
	return logger;
}
}