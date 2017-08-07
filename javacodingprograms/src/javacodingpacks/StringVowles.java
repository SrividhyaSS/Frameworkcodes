package javacodingpacks;

public class StringVowles {

	public static void main(String[] args)
	{
		
		String str = "selenium";
		
		System.out.println("print the given string:"+str);
		
		char [] ch = str.toCharArray();
		
		int count = 0;
		
		for (char chars : ch)	
		{
			switch(chars)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
			
				
		}

		}

		System.out.println("print the count of vowles:"+count);
	}
}

	

		
