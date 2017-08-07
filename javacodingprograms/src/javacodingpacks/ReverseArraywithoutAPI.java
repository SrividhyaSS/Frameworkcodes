package javacodingpacks;

public class ReverseArraywithoutAPI {

	public static void main(String[] args)
	{
		 int [] numbers = {1,2,3,4,5,6,7,8,9,10}; // syntax of 1 D array //
		 System.out.println("print the array before reverse:");
		 for (int i=0; i<numbers.length; i++)
		 {
			 System.out.println(numbers[i]+" ");
		 }
		 
		for (int i=0, j=numbers.length-1; i<j; i++, j--)
		{
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			
		}
		
		System.out.println("print the array after reverse:");
		 for (int i=0; i<numbers.length; i++)
		 {
			 System.out.println(numbers[i]+" ");
		 }
		

	}

}
