package javacodingpacks;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupliatesString 

{
	static String RemoveDupliates (String str)
	{
		
		Set <Character> set = new HashSet<>(); // empty hash set created
		
		StringBuffer sb = new StringBuffer (); // empty string buffer created
		
		for (int i=0; i<str.length(); i++) // take loop for string to get each character
		{
			Character c = str.charAt(i); // character is having - J (traverse through loop)
			
			if (!set.contains(c)) // if set is not contains J , add it and append it in string buffer also
			{
				set.add(c);
				sb.append(c);
			}
			
				
			
		}
		
		return sb.toString();
	}
	
	
	

	public static void main(String[] args)
	{
		String str = "JAVA";
		System.out.println("Actual String :"+str);
		System.out.println("after Removal of Duplicates:"+RemoveDupliates(str));

	}

	
	
}
