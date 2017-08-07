package javacodingpacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) 
	
	{
		
		String input = "";
		System.out.println("Enter the input string");
		try 
		{
		
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			input = br.readLine();
			char [] chararray = input.toCharArray();
			for (int i=chararray.length-1; i>=0; i--)
			
				System.out.println(chararray[i]);
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	
}
