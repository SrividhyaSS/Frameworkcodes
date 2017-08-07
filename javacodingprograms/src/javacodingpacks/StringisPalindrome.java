package javacodingpacks;

public class StringisPalindrome {

	public static void main(String[] args)
	{
	
		String originalstr = "MADAM";
		String revstring = "";
		
		for (int i=originalstr.length()-1; i>=0; i--)
		{
			revstring = revstring+originalstr.charAt(i);
		}
		
		if (originalstr.equalsIgnoreCase(revstring))	
		{
			System.out.println("Given string is palindrome");
		}
			
		else
		{
			System.out.println("Given string is not palindrome");
		}
		
		
		
		
		
	}

}
