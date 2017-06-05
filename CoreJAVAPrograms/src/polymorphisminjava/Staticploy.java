package polymorphisminjava;

public class Staticploy {
	
	 float c;
		
	 float  case1 (int a, int b)
	{
		return c = a + b;
	}
	
	float case1 (float a, float b)
	{
		return c = a + b;
		
	}
	
	float case1 (int a, float b)
	{
		return c = a+b;
	}
	
	float case1 (float b, int a)
	{
		return c = a + b;
	}
	
	float case1 (int a, int b, int d)
	{
		return c = a + b + c;
	}
	
	float case1 (int a, int b, int d, int e)
	{
		return c = a + b + c + d;
	}
	
	public static void main(String[] args) 
	{
		Staticploy obj = new Staticploy();
		obj.case1(1, 2);
		System.out.println("PRINT the value of c : " +obj.c);
		obj.case1(3, 4);
		System.out.println("PRINT the value of c : " +obj.c);
		obj.case1(5, 6);
		System.out.println("PRINT the value of c : " +obj.c);
		obj.case1(7, 8);
		System.out.println("PRINT the value of c : " +obj.c);
		obj.case1(9, 10, 11);
		System.out.println("PRINT the value of c : " +obj.c);
		obj.case1(12, 13, 14, 15);
		System.out.println("PRINT the value of c : " +obj.c);
		
		
	}

}
