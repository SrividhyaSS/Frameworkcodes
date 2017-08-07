package javacodingpacks;

import java.util.Arrays;

public class SortSring {

	public static void main(String[] args) 
	{
	
		String str = "SELENIUM";
		char [] ch = str.toCharArray();
		Arrays.sort(ch);
		String sortedarray = new String (ch);
		System.out.println("Print the sorted array :"+sortedarray);

	}

}
