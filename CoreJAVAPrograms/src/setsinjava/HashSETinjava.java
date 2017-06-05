package setsinjava;

import java.util.HashSet;
import java.util.Set;

public class HashSETinjava {

	public static void main(String[] args) 
	{

		// set is not allow duplicates 
		 // set there is no get / set methods - list having get/set methods 
		// HashSet output is not a predictable in order
		 // null values are allowed
		
		Set<String> hs = new HashSet<>(); 
		hs.add("joe");                   
		hs.add("john");				  
		hs.add("dora");              
		hs.add("dora");
		hs.add("ABC");
		hs.add(null);

		for (String hsl : hs)
		{
			System.out.println("print the set element : "+hsl);
		}


		System.out.println("Check the name of dora is there in the list ? : "+hs.contains("dora"));

	}

}
