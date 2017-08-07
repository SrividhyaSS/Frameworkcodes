package abstractinjava;

public abstract class Abstractwithconstructor 
{
	
	public Abstractwithconstructor()
	{
		
		System.out.println("print the constructor");
		
	}
	abstract void display();
	public static void move()
	{
		System.out.println("Static method with move");
	}
	
	void nonstatic()
	{
		System.out.println("Non-Static");
	}
}
