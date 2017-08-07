package javacodingpacks;

import java.util.LinkedHashMap;

public class FirstNonrepeatedchar {

	public static void main(String[] args)
	{
	
		String str = "ffeeddbbaaclck";
		char ch [] = str.toCharArray();
		LinkedHashMap <Character,Integer> map = new LinkedHashMap <>();
		for (char chars : ch)
		{
			if (map.containsKey(chars))
			{
				map.put(chars, map.get(chars)+1);
				
			}
			else
			{
				map.put(chars, 1);
			}
		}

		for (char chars : ch)
		{
			if (map.get(chars) == 1)
			{
				 System.out.println("First non repeated characted in String \""
			              + str + "\" is:" +chars);
				break;
			}
		}
	}

}
