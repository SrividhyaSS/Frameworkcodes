package abstractinjava;

public class Baseclass extends Superclass {

	
	void display() 
	{
	
		System.out.println("print Display");
	}

	
	public void movie() 
	{
		System.out.println("Print movie");
		
	}

	public void ownmethod ()
	{
		System.out.println("own method");
	}
	
	public static void main (String[] args)
	
	{
		Baseclass obj = new Baseclass();
		obj.callme();
		obj.display();
		obj.movie();
		obj.ownmethod();
	}
}
