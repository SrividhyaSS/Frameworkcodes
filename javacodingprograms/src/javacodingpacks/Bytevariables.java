package javacodingpacks;

public class Bytevariables {
	
	byte a=1;
	byte b=1;
	byte c;
	
	public void additon ()
	{
		c = (byte) (a+b);
	}
	
	public static void main (String args [])
	{
		Bytevariables obj = new Bytevariables();
		obj.additon();
		System.out.println("Print the value of c : " +obj.c );
				
	}
			

}
