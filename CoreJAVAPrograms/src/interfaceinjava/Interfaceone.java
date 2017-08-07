package interfaceinjava;

public interface Interfaceone 

{

	
	public static void display()
	{
		System.out.println("print disply in interfaceone");
	}
	
	default void move()
	{
		System.out.println("Default move from interfaceone");
	}
	
	void print();
	
}
