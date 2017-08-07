package javacodingpacks;

public class MissingNumbers

{

	static int [] arr = {2,4,8};
	
	
	public static void findingmissingnumbers()
	{
		
		System.out.println("print given array");
		for (int j=0; j<arr.length; j++)
			
		System.out.println(arr[j]);
		
		int j=0;
		
		System.out.println("Print the missing numbers");
		for (int i=0; i<10; i++)
		{
			if (j<arr.length && i == arr[j])
			{
			j++;
			}
			else
			{
				System.out.println(i+"");
			}
			
				
			
		}
		
		
			
		
	}
	
	public static void main(String[] args)
	{
		
		findingmissingnumbers();
	}

}
