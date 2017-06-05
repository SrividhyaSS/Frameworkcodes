package setsinjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bulkoperationbetweensets {

	public static void main(String[] args) 
	
	{
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(20,50,60,70,88,100));
		
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(20,50));
		
		if (s1.containsAll(s2))
		{
			System.out.println("Print S2 is the subset of S1");
		}
		else 
		{
			System.out.println("Print S2 is not a subset of S1");
		}
		

	}

}
