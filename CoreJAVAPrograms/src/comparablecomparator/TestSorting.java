package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting {

	public static void main(String[] args)
	{
	
		ArrayList<Student> arr = new ArrayList<>();
		
		arr.add(new Student(101,"Vijay",23));
		arr.add(new Student(106,"Ajay",27));
		arr.add(new Student(105,"Jai",21));  
		Collections.sort(arr);
		
		for (Student st : arr)
		{
			System.out.println(st.rollno+"  "+st.name+" "+st.age);
			
		}
		
		
	}

}
