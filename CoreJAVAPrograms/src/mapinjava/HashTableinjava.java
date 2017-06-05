package mapinjava;

import java.util.Hashtable;

public class HashTableinjava 	
{

	// set is the interface it it implements hash table
	// it is same as hash map
	
	public static void main (String args [])
	{
		
	// create and populate hash table // 
		
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	ht.put(100, "Amit");
	ht.put(102,"Ravi");  
	ht.put(101,"Vijay");  
	ht.put(103,"Rahul");  
	 // ht.put(null, "test"); // it should not allow any null keys
	
	System.out.println("print the hash table values :"+ht);
	
	// remove entry from hash table //
	
	ht.remove(103);
	
	System.out.println("print the hash table values after remove :"+ht);
	
	
}
}

