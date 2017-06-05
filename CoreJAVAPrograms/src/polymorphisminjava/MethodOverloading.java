package polymorphisminjava;

public class MethodOverloading {
	int Totalmarks;

	int add (int m1, int m2, int m3)
	{	
		return  Totalmarks = m1 + m2 + m3;		
	}
	
	int add (int m1,int m2, int m3, int m4 )
	{
		return Totalmarks = m1 + m2 + m3 + m4;
	}
	int add (int m1,int m2, int m3, int m4, int m5 )
	{
		return Totalmarks = m1 + m2 + m3 + m4 + m5;
	}
	
		public static void main(String[] args) 
	{
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(1, 2, 3);
		System.out.println("PRINT the TotalMarks : " +obj.Totalmarks);
		obj.add(4, 5, 6, 7);
		System.out.println("PRINT the TotalMarks : " +obj.Totalmarks);
		obj.add(8, 9, 10, 11, 12);
		System.out.println("PRINT the TotalMarks : " +obj.Totalmarks);
		
		
		
	}
		}


