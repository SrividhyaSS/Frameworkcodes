package runnerpackagge;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		
		
		{
			
			TestNG runner = new TestNG();  // Executing only failed test cases using run manager program. this should comes under separate package //
			
			List<String> list = new ArrayList<String>(); 
			
			list.add("D:\\SeleniumPractice\\srividhya\\seleniumcommandsprj\\test-output\\Default suite\\testng-failed.xml"); // here mentioned failed.xml path //
			
			runner.setTestSuites(list);
			
			runner.run();
					

		}

	}

}
