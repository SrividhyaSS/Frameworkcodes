package mapinjava;

import java.util.Map;
import java.util.TreeMap;

public class MapBookExample {

	public static void main(String[] args)
	
	{
	
		//Creating map of Books   
		
		Map<Integer, Book> map = new TreeMap <> (); // calling book - constructor class here //
		
		// Creating books 
		
		Book b1 = new Book(101, 2, "JAVA", "Forouzan", "Mc Graw Hill"); // create object and enter the values of book constructor class // 
		Book b2 = new Book (102,4, "Data Communications & Networking","Forouzan","Mc Graw Hill");    
		Book b3 = new Book (103,6,"Operating System","Galvin","Wiley");  
		
		// Adding books to map

		map.put(10001, b1); // Key is integer - give any value / value is book - map the book details created above //
		map.put(10002, b3);
		map.put(10003, b2);
		
		// Traversing map
		
		for (Map.Entry<Integer, Book> mapentry : map.entrySet())
		{
			int Key = mapentry.getKey();
			Book value = mapentry.getValue();
			System.out.println("print the book details :" +Key);
			System.out.println(value.id+" "+value.quantity+" "+value.name+" "+value.author+" "+value.publisher);
			
			
			
		}
		
		
	}

}
