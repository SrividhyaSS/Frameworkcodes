package javacodingpacks;

import java.util.Arrays;

public class StringsAreAnagram2 {

	public static void main(String[] args) 
	{
		
		String Str1 = "motherinlaw";
		String Str2 = "hitlerwoman";
		System.out.println("Print the String are anagrams: "+AnagramCheck(Str1, Str2));

	}

	public static boolean AnagramCheck (String Str1, String Str2)
	{
		
		char [] chararrayofStr1 = Str1.toCharArray();
		char [] chararrayofStr2 = Str2.toCharArray();
		Arrays.sort(chararrayofStr1);
		Arrays.sort(chararrayofStr2);
		return Arrays.equals(chararrayofStr1, chararrayofStr2);
		
		
	}
}
