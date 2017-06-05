package setsinjava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetinJAVA {

	// set is not allow duplicates
	// set there is no get / set methods - list having get/set methods
	// null values are allowed
	// LinkedHashset - output in which they are added
	
	
	public static void main(String[] args)
	{
	
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("Srividhya");
		lhs.add("Srinath");
		lhs.add("Shringesh");
		lhs.add("Srividhya");
		lhs.add(null);
		
		for (String lhselement : lhs)
		{
			System.out.println("print the linked hasset elemenet :"+lhselement);
		}
		

	}

}
