package vectorinjava;

import java.util.Enumeration;
import java.util.Vector;

public class VectorinJAVA 
{
	public static void main (String args[])
	{
		Vector<String> V = new Vector<String>(); // //creating vector 
		V.add("umesh");
		V.add("irfan");
		V.add("kumar");
		
		 //traversing elements using Enumeration  
		
		Enumeration<String> e = V.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println("print the vector :"+e.nextElement());
		}
		
		
	}

}
