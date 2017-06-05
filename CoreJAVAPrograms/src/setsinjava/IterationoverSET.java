package setsinjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationoverSET {

	public static void main(String[] args) 
	
	{
		Set<String> names = new HashSet<>();
		names.add("tom");
		names.add("Mary");
		names.add("peter");
		names.add("alice");
		
		Iterator<String> ite = names.iterator();
		
		while (ite.hasNext())

		{
			String name = ite.next();
			System.out.println("print the values :"+name);
		}
	}

}
