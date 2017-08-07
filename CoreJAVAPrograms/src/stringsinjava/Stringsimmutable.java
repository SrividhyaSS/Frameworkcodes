package stringsinjava;

public class Stringsimmutable {

	public static void main(String[] args) 
	
	{
	
		// String s="Sachin";  
		//  s.concat("Tendulkar");//concat() method appends the string at the end  
		//   System.out.println(s);//will print Sachin because strings are immutable objects 
		   
		   String s="Sachin";  
		   String s1 = s.concat("Tendulkar");  
		   System.out.println(s1); // in such case, s points to the "Sachin Tendulkar". Please notice that still sachin object is not modified.
		
		
	}

}
