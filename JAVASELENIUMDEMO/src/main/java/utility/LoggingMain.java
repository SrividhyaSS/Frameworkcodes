package utility;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingMain {

	
	public static void main(String[] args) 
	
	
	{
		Logger logger = Logger.getLogger("LogginMain");
		
		 PropertyConfigurator.configure("D:/GIT-codes/JAVASELENIUMDEMO/src/main/resources/log4j.properties");
		 
		  logger.info("Hello world");
		  logger.info("we are in logger info mode");

	}

}
