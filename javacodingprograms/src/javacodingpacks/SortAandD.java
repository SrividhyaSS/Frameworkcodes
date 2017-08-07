package javacodingpacks;

import java.util.Arrays;
import java.util.Collections;

public class SortAandD {

	
	
	public static void main(String[] args) 
	{
		String [] str = {"b","a","d","c"};
		
		System.out.println("Print the String to Sort:");
		
		for (String string : str)
		{
			System.out.println(string);
		}
		
		
		Arrays.sort(str);
		
		System.out.println("Print the String in ascending order :");
		
		for (String string : str)
		{
			System.out.println(string);
		}

		
		Arrays.sort(str, Collections.reverseOrder());
		
		System.out.println("Print the String in descending order :");
		
		for (String string : str)
		{
			System.out.println(string);
		}
	}



}
