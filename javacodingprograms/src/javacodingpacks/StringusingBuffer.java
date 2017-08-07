package javacodingpacks;

public class StringusingBuffer {

	public static void main(String[] args) 
	
	{
		String input = "SELENIUM";
		System.out.println("Print the string before reverse :"+input);
		StringBuffer str = new StringBuffer(input);
		System.out.println("Print the string after reverse :"+str.reverse());
		

	}

}
