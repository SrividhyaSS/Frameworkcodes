package stringsinjava;

public class StringBuilderExample {

	public static void main(String[] args) 
	{
		StringBuilder SB = new StringBuilder ("HELLO");
		SB.append("JAVA"); //now original string is changed  
		System.out.println(SB); // So string builder is mutable - can be modified

	}

}
