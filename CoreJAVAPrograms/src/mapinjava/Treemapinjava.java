package mapinjava;

import java.util.Map;
import java.util.TreeMap;

public class Treemapinjava {
	
	// Treemap maintained in ascending order // 

	public static void main(String[] args)
	{
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(100, "Raghul");
		tm.put(200, "Vijay");
		tm.put(300, "Amit");
		
		System.out.println("print the tree map values :"+tm);
		
		for (Map.Entry<Integer, String> map : tm.entrySet())
		{
			System.out.println(map.getKey()+ " print the tree map in order  " +map.getValue());
			
		}
		
	}

}
