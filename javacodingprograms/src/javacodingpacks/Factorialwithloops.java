package javacodingpacks;

public class Factorialwithloops {

	public static void main(String[] args) 
	{
		int i=1;
		int fact = 1;
		int number = 5; // 5! - > 5 * 4* 3* 2 * 1 = 120
		
		for (i=1; i<=number; i++)
		{
			fact = fact * i;
			
		}

			System.out.println("print the factorial number : "+fact);
	}

}
