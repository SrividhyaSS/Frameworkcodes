package listoperationsinjava;

import java.util.ArrayList;
import java.util.List;

public class CheckDuplicatesinList {

	public static void main(String[] args)
	{
	
		List <String> duplist = new ArrayList<>();
		duplist.add("A");
		duplist.add("B");
		duplist.add("A");
		duplist.add("A");
		duplist.add("C");
		
		String checkDuplicates = "A";
		for (String element : duplist)
		{
		//	System.out.println("print the array list :"+element);
			if (element.equals(checkDuplicates))
				
			{
				String inner_list = element;
				System.out.println("print the equal list : "+inner_list);
			}
			
			
		}
		
		
	
	}
	

}
