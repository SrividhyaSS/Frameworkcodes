package javacodingpacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStringinJAVA 
{

	static void duplicateCharCount (String inputString)
	{
		
		Map <Character, Integer> charCountMap = new HashMap <> ();
		
		char [] StrArray = inputString.toCharArray();
		
		for  (char c : StrArray)
		{
			
			if (charCountMap.containsKey(c))
			{
				charCountMap.put(c,charCountMap.get(c)+ 1 );
			}
			
			else
			{
				charCountMap.put(c, 1);
			}
		}	
		
		Set <Character> charsInString = charCountMap.keySet();
		 System.out.println("Duplicate Characters In "+inputString);
		
		for (Character ch : charsInString)
		{
			
			if (charCountMap.get(ch) > 1)
			{
				System.out.println(ch +" : "+ charCountMap.get(ch));
			}
		
			
	
		}
			
		}
		
		
	
		public static void main(String[] args) 
	{
		duplicateCharCount("JAVAJ2EE");
		

	}

}
