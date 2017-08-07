package polymorphisminjava;

public class DynamicPolyChild extends DynamicPolyParentclass 

{
	
	public void add ()
	{
		System.out.println("This is the add method from child class");
	}
	
	public void sub ()
	{
		System.out.println("This is the sub method from child class");
	}

	public static void main(String[] args)
	
	{
	/*DynamicPolyParentclass p1 = new DynamicPolyChild(); // upcasting
		p1.add();
		p1.sub();*/
		
		
		
		DynamicPolyParentclass p1 = new DynamicPolyChild(); // down casting
		DynamicPolyChild c = (DynamicPolyChild) p1;
		c.add();
		c.sub();
		p1.add();
		p1.sub();
	
	
		
	
		
		


	}

}
