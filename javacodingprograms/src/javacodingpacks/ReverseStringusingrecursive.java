package javacodingpacks;

public class ReverseStringusingrecursive {

	public static void main(String[] args) 
	{

		String str = "SELENIUM";
		System.out.println("Print before reverse:"+str);
		System.out.println("print aftter reverse :"+recursiveMethod(str));
	}

	 static String recursiveMethod(String str) 
	 {
		
		if ((null == str) || (str.length()<=1))
		{
			return str;
		}
	
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	    }
	 
	 
	 

}
