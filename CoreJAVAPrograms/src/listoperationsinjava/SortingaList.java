package listoperationsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingaList {

	public static void main(String[] args) 
	{
		List<String> sortlist = new ArrayList<>();
		sortlist.add("D");
		sortlist.add("C");
		sortlist.add("E");
		sortlist.add("A");
		sortlist.add("B");
	
		System.out.println("List the array before sorting :"+sortlist);
		Collections.sort(sortlist);
		System.out.println("List the array after sorting :"+sortlist);
	
	
	}

}
