package comparablecomparator;

//comparable is the interface available in java collection frameworks
// it is used to sort the element based on single data member

public class Student implements Comparable<Student>

{
	int rollno;
	String name;
	int age;
	
 public Student (int rollno, String name, int age)
{


this.rollno =rollno;
this.name = name;
this.age = age;



	
} 
	
  // this method is available in comparable interface /
	public int compareTo(Student st)
	{
		
		if (age==st.age)		
		return 0;
		
		else if (age>st.age)
		return 1;
			
		else
			
			return -1;
		
		
	}
	
}	


