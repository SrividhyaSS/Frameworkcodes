package constructorinjava;

public class EMP extends Person
{
	float salary;
	
	public EMP(int id, String name, float salary) 
	{
		super(id, name); // reusing parent constructor //
		this.salary = salary;
		
	}

	void display ()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}
	
}
