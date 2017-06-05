package encapsulationinjava;


public class CallingEncaps {

	public static void main(String[] args) 
	{
		
	Privateclassone obj = new Privateclassone();
	obj.setAge(55);
	obj.setName("Greg");
	obj.setMobilenumber(1234567890);
	
	System.out.println("Age : "+obj.getAge());
	
	System.out.println("Name : "+obj.getName());
	
	System.out.println("MobileNumber : "+obj.getMobilenumber());
		
	
		
		

	}

}
