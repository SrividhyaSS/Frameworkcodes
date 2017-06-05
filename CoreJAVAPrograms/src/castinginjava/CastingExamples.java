package castinginjava;

public class CastingExamples {

	public static void main(String[] args) 
	{
		int i = 100;
		long l = i;  // implicit type of casting int can be converted to long .
		float f = l; // long can be converted to float
		
		System.out.println("int value :" +i);
		System.out.println("long value : "+l);
		System.out.println("Float value :" +f);
		
		double d = 100.4;
		float f1 = (float) d; // explicit casting 
		long l1 = (long) f1;
		
		System.out.println("double value  :" +d);
		System.out.println("casting float value : " +f1);
		System.out.println("casting long value :" +l1);
		
		
				

	}

}
