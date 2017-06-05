package listoperationsinjava;

import java.util.ArrayList;
import java.util.List;

public class ListBasicoperations {

	public static void main(String[] args)
	{
	
		List<String> arrlist = new ArrayList<>(); // Syntax of ArrayList
		arrlist.add("1");
		arrlist.add("2");
		arrlist.add("3");
		arrlist.add("1,4");
		arrlist.add(null);
		arrlist.add("2");
		
		for (String element : arrlist) // using Iterate through all the elements
		{
			System.out.println("print the list of arrays :"+element);
		}
		
		System.out.println(arrlist.size()); // get all the array size
		System.out.println(arrlist.get(3)); // get the 3rd position of array value 
		System.out.println(arrlist.set(1, "22")); // change the 1st index value
		System.out.println(arrlist.get(1)); // get the 1st index value
	
		if (arrlist.remove("1")) // remove 1st index value if the value is having "1".
		{
			System.out.println("value is removed");
		}
		else 
		{
			System.out.println("There is no such element present");
		}
		
	}

}
