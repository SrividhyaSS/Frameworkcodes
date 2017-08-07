package javacodingpacks;

public class FindlengthofString {

	public static void main(String[] args)
	{
		String str = "SELENIUM";
		char [] ch = str.toCharArray();
		int count = 0;
		for (char chars : ch)
		{
			System.out.println("Print the character of string:"+chars);
			count ++;
			break;
		}

		System.out.println("print the length of string :"+count);
	}

}
