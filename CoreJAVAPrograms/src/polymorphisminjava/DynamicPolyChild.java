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
		DynamicPolyParentclass p1 = new DynamicPolyChild();
		p1.add();
		p1.sub();
		
		


	}

}
