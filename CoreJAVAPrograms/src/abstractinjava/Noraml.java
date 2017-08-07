package abstractinjava;

public class Noraml extends Checking
{

	int interestrate ()
	{
		return 7;
	}
	
	void display ()
	{
		System.out.println("print display");
	}
	public static void main(String[] args) 
	{
	//	Checking C;
	//	C= new Noraml();  // one way of implementation 
	Noraml C = new Noraml();  //second way - child class reference with child class object
		
	// Checking C = new Noraml();  // -- third way
		
	//	Checking C = new Checking(); // cannot instantiate, because it is abstract class
		
		
		
		System.out.println("Rate of Interest is: "+C.interestrate()+" %"); 
		
		
		C.display();

	}

}
