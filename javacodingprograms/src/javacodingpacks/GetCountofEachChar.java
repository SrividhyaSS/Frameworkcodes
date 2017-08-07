package javacodingpacks;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetCountofEachChar {

	public static void main(String[] args) 
	{
		String input = "SHRINGESH";
		char [] allchars = input.toCharArray();
		LinkedHashMap <Character, Integer> map = new LinkedHashMap <> ();
		
		for (char c : allchars)
		{
			if (map.containsKey(c))
			{
				
			map.put(c, map.get(c)+1);
			
			}
			
			else
			{
				map.put(c,1);
			}
		}
				
		System.out.println(map);
	}

}
