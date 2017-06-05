package setsinjava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetinjava {
	
	// set is not allow duplicates
	// set there is no get / set methods - list having get/set methods
	// null values are not allowed in TreeSet
	// TreeSet - output is in order

	public static void main(String[] args) 
	{
		
		Set<String> ts = new TreeSet<>();
		ts.add("bob");
		ts.add("stuart");
		ts.add("greg");
		ts.add("Alexander");
		ts.add("Alexander");
	//	ts.add(null);
		
		
		for (String ts1 : ts)
		{
			System.out.println("print the TREESET element : "+ts1);
		}

	}

}
