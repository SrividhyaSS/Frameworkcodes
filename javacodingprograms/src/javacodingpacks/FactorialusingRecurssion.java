package javacodingpacks;

public class FactorialusingRecurssion {
	
	static int factorial (int n)
	{
		if (n == 0)
		{
			return 1;
		}
		
		else
		{
			return (n * factorial (n-1));
		}
	}

	public static void main(String[] args)
	{
		int i = 1;
		int fact = 1;
		int number = 6;
		
		for (i =1; i<=number; i++)
		{
			fact = factorial(number);
		}
		
		System.out.println("print the factorial of nuber : "+fact);

	}

}
