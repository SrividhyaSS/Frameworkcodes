package constructorinjava;

public class ParameterConst 
{

	int id;
	String name;
	
	public ParameterConst(int id, String name) 
	
	{
	this.id = id; // if u giving id as id, there is no effect to this param. you have give id = i or this.id - id; //
	this.name = name;
		
	}
	
	void display ()
	{
		System.out.println(id+" "+name);	
	}

	public static void main(String[] args) 
	{
	
		ParameterConst p1 = new ParameterConst(111, "ABC");
		ParameterConst p2 = new ParameterConst(112, "DEF");
		p1.display();
		p2.display();

	}

}
