package inheritanceinjava;

public class InheritanceB extends InheritanceA {
	
	public static void mul (int a, int b)
	{
		c = a*b; 
	}
	
	public static void div (int a, int b)
	{
		c = a/b;
	}

	public static void main(String[] args)
	
	{
	
		InheritanceA.add(50, 60); // Static method Syntax: Classname.Methodname
		System.out.println("Print addition : "+ InheritanceA.c);
		InheritanceA.sub(85, 75);
		System.out.println("Print subtraction : "+ InheritanceA.c);
		InheritanceB.mul(10, 10);
		System.out.println("Print the multiplication : " +InheritanceB.c);
		InheritanceB.div(12, 12);
		System.out.println("Print the division : " + InheritanceB.c);
		
	}

}
