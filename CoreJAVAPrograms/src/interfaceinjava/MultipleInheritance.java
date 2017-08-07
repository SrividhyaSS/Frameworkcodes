package interfaceinjava;

public class MultipleInheritance implements M1, M2 {

	public static void main(String[] args)
	{
		
		
		MultipleInheritance Mi = new MultipleInheritance ();
		Mi.display();
	
	
		
		
	}

	@Override
	public void display() 
	{
		
		System.out.println("Hello");  
	}

}
