package stringsinjava;

public class StringDemo1 {

	public static void main(String[] args) 
	{
	
		String name = "Selenium WEB driver";
		boolean StartStatus = name.startsWith("Selenium");
		System.out.println("print the start status : "+StartStatus);
		
		
		String name1 = "Selenium with jenkins integration";
		boolean EndStatus = name1.endsWith("jenkins");
		System.out.println("print the start status : "+EndStatus);
		
		String actual = "Webservice - SOAPUI";
		String expected = "Webservice - SoapUI";
		boolean results = actual.equals(expected);
		System.out.println("print the test result is : "+results );
		
		String actual1 = "Webservice - SOAPUI";
		String expected1 = "Webservice - SoapUI";
		boolean results1 = actual1.equalsIgnoreCase(expected1);
		System.out.println("print the test result is : "+results1 );
		
		
		String actual2 = "Webservice - SOAPUI";
		String expected2 = "webservice";
		boolean results2 = actual2.contains(expected2);
		System.out.println("print the test result is : "+results2 );
	}

}
