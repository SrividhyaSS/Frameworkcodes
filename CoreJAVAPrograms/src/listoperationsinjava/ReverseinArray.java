package listoperationsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseinArray {

	public static void main(String[] args) 
	{
	

		List<Integer> reverselist = new ArrayList<>();
		
		for (int i=0; i<=10; i++) // instead of giving reverselist.add(1); reverselist.add(2), gave for loop and use add option //
		reverselist.add(i);
		System.out.println("print the number before reverse list : "+reverselist);
		Collections.reverse(reverselist);
		System.out.println("print the number after reverse list : "+reverselist);
		
		
	}


		
	}


