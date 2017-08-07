package javacodingpacks;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sortmapinjava {

	public static void main(String[] args) 
	{
		Map<Integer, String> unsortMap = new HashMap<Integer, String>();
		unsortMap.put(10, "z");
		unsortMap.put(6, "a");
		unsortMap.put(50, "j");
		unsortMap.put(7, "e");
		System.out.println("print the unsorted map using hashmap");
		printMap(unsortMap);
		System.out.println("\nSorted Map......By Key");
		
		Map<Integer, String> treeMap = new TreeMap<>(
			(Comparator<Integer>) (o1, o2) -> o2.compareTo(o1));
		treeMap.putAll(unsortMap);
		printMap(treeMap);
        
	}

	public static <K,V> void printMap(Map<K, V> map)
	{
		for (Map.Entry<K, V> entry : map.entrySet()) 
			
		{
            System.out.println("Key : " + entry.getKey()				+ " Value : " + entry.getValue());
		
		}

}
}

