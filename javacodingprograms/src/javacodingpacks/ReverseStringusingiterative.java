package javacodingpacks;

public class ReverseStringusingiterative {

	public static void main(String[] args) 
	{
		
		String input = "SELENIUM";
		System.out.println("print String before reverse :"+input);
		char [] arr = input.toCharArray();
		
		for (int i = arr.length - 1; i>=0; i-- )
		{
			System.out.println("Print String after reverse :" +arr[i]);
		}
		
		System.out.println();
	}

}
