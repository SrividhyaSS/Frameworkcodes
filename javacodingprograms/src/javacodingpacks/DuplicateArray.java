package javacodingpacks;

public class DuplicateArray 
{

	public static void main(String[] args)
	{
	
		String DuplicateArray [] = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		{
			for (int i=0; i<DuplicateArray.length; i++)
			{
				// System.out.println("print the array values :" +DuplicateArray[i]);
				for (int j=i+1; j<DuplicateArray.length; j++)					
				{
					if (DuplicateArray[i].equals(DuplicateArray[j]))
					{
						System.out.println("print the duplicate array : "+DuplicateArray[i]);
					}
						
				}
			}
		}
		
		
		
		

	}

}
