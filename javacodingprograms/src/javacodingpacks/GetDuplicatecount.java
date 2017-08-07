package javacodingpacks;

import java.util.ArrayList;
import java.util.List;

public class GetDuplicatecount {

	public static void main(String[] args) 
	{
		
		List <String> l = new ArrayList <>();
		
		l.add("A");
		l.add("B");
		l.add("A");
		
		String duplicates = "A";
		
		int i =0;
		
		for (String dul : l)
		{
			if (dul.equals(duplicates))
			{
				i++;
			}
		}
		
			System.out.println(i);
		
	}

}
