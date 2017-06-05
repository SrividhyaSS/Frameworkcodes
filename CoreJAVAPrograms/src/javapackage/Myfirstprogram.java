package javapackage;

public class Myfirstprogram {
	
	int a=10,b=20; int c; // Declare the variable 

	void add () // Create methods for the operations 
	{
		c = a+b;
	}
	
	void mul ()
	{
		c = a * b;
	}
	
	int sub () // void is not using so it will return some values. 
	{
		return c = a - b;
	}

	public static void main(String[] args)  // calling with reference instance and print
	{
		Myfirstprogram s1 = new Myfirstprogram ();
		s1.add();
		System.out.println("Addition : "+s1.c);
		s1.mul();
		System.out.println("multiplication :"+s1.c);
		s1.sub();
		System.out.println("Subtraction :"+s1.c);

	}

}
