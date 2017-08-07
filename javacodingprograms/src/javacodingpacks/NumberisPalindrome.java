package javacodingpacks;

public class NumberisPalindrome {

	public static void main(String[] args)
	{
		int n = 454;
		int r;
		int sum=0;
		int temp;
		temp=n; 
		
		
		while  (n>0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
			
			
		}

		if (temp==sum)
		{
			System.out.println("Given number is palindrome");
		}
		
		else 
		{
			System.out.println("Given number is not palindrome");
		}
	}

}
