package listoperationsinjava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBasicoperations {

	public static void main(String[] args)
	{
	
		List <Integer> basiclinkedlist = new LinkedList<>(); // Syntax of linked list
		basiclinkedlist.add(1);
		basiclinkedlist.add(2);
		basiclinkedlist.add(3);
		basiclinkedlist.add(1);
		basiclinkedlist.add(null);
		
		for (Integer element : basiclinkedlist)
		{
			System.out.println("Print the linkedlist elemenet : "+element); // getting array values
		}
		
		basiclinkedlist.set(4, 5); // modify the record
		basiclinkedlist.get(4);
		System.out.println("Print the 4th index array value : " + basiclinkedlist.get(4)); // get the modified record
		

	}

}
