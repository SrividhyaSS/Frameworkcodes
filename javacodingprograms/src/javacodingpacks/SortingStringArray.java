/**
 * 
 */
package javacodingpacks;

import java.util.Arrays;

/**
 * @author 259532
 *
 */
public class SortingStringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		String [] inputList = {"Jan", "Feb", "Mar", "Apr"};
		System.out.println("-------- before sorting ---------");
		showList (inputList);
		Arrays.sort(inputList);
		System.out.println("-------- after sorting ---------");
		showList (inputList);
		
	
	}

	public static void showList(String[] inputList) 
	{
		for (String Str : inputList)
		{
			System.out.println("Print : "+Str);
		}
		System.out.println();
	}

}
