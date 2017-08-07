package javacodingpacks;

public class Swapnumberwithvariable {
	
	public static void main (String args []) // swaping numbers with using third variable
	{
		int x = 10;
		int y = 20;
		int temp;
		/*temp = x;
		x = y;
		y = temp;*/
		
		temp=y;
		y=x;
		x=temp;
		
		System.out.println("Print X value is : " +x);
		System.out.println("Print Y value is : "+y);
		
		// swaping numbers with out using third variable
		
		x = 5;
		y = 6;
		
		x = x + y; // X value is 11
		y = x - y; // Y value is 11-6 : 5
		x = x - y; // 11 - 5 is 6
		
		System.out.println("Print X value is : " +x);
		System.out.println("Print Y value is : "+y);
		
		
		
	}
	
	
	
 

}
