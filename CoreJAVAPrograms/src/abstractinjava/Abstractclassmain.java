package abstractinjava;

public class Abstractclassmain extends Abstractwithconstructor


{

	public static void main(String[] args)
	{

		Abstractclassmain abs = new Abstractclassmain();
		Abstractclassmain.move();
	
		abs.nonstatic();
		abs.display();
		
		
		


	}

	@Override
	void display() 
	{
	
		System.out.println("This is child class move");
	}

}
