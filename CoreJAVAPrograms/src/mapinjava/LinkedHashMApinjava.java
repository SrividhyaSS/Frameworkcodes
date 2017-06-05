package mapinjava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMApinjava 

{

	public static void main (String args [])
	{
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(100, "Amit");
		lhm.put(200, "vijay");
		lhm.put(300, "Raghul");
		
		for (Map.Entry<Integer, String> map : lhm.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}
}
