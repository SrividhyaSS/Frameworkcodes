package mapinjava;

import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {
	
	
	// Map is the interface which implements hashtable, hashmap, linkedhashmap and treemap
	// it is key value pair
	// duplicates are not allowed in key table
	// put can be used to insert the values
	// get can be used to retrieve the values
	// there is no add concepts

	public static void main(String[] args) 
	{
		Map<String,String> hm = new HashMap<>();
		hm.put("Navin", "1234567890");
		hm.put("Ali", "9347891302");
		hm.put("Archana", "8954671283");
		hm.put("Navin", "2222222222"); 
		hm.put(null, "3333333333");
		hm.put(null, "4444444444");
		
		System.out.println("print the vlaue :"+hm.get("Navin")); // print the latest values
		System.out.println("print the value :"+hm.get(null)); // print the latest null values
		
		for(Map.Entry<String, String> m : hm.entrySet()) // map entry used to iterate / get the value of map with key value pair
		{
			System.out.println( m.getKey()   + "        " +    m.getValue() );
		}
	}

}
