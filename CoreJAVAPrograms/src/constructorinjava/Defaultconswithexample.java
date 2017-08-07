package constructorinjava;

public class Defaultconswithexample {
	
	int id;  
	String name;  // you are not creating any constructor so compiler provides you a default constructor.Here 0(int) and null (String) values are provided by default constructor.// 

	void display()
	{
		System.out.println(id+" "+name);
		
	} 
	
	
	public static void main(String[] args)
	
	{
		Defaultconswithexample s1=new Defaultconswithexample();  
	Defaultconswithexample s2=new Defaultconswithexample();  
		s1.display();  
	 s2.display(); 

	}

}
