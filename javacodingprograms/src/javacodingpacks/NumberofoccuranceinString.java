package javacodingpacks;

public class NumberofoccuranceinString {

	public static void main(String[] args)
	{
		
		String input = "SRIVIDHYAaaa";
		int occurance  = 0;
		char [] charlist = input.toCharArray();
		for (char c : charlist)
				
		if(c=='a')
		{
			occurance  ++;
		}

		System.out.println("Occurance of a is :" +occurance);
	}
	
	}



