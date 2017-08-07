package inheritanceinjava;

public class EMP  // This is the example for aggregation // 
{

	int id;
	String name;
	Address address; // calling object class


public EMP (int id, String name, Address address )
{
	this.id = id;
	this.name = name;
	this.address = address; // reuse the Address class methods / variables //
}

void display ()
{
	System.out.println(id+" "+name);
	System.out.println(address.City+" "+address.Country+" "+address.State);
}
public static void main (String args[])
{
	Address add = new Address ("CH", "IN", "TN");
	EMP e = new EMP(111, "SRI", add);
	e.display();
	
	
}

}
