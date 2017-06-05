package javapackage;

public class Schoolrecord {
	
	int m1,m2,m3;
	static float totalmarks;

	
	void calmarks (int m1, int m2, int m3)
	{
		totalmarks = m1+m2+m3/3;
		
	}
	
	float calaverage ()
	{
		return totalmarks/3;
		
	}
	
	public static void main(String[] args) 
	{
		
		Schoolrecord obj = new Schoolrecord();
		obj.calmarks(99,88,86);
		
		// System.out.println("Print the total marks: "+obj.totalmarks);
		
		System.out.println(Schoolrecord.totalmarks);
		obj.calaverage();
		System.out.println(	obj.calaverage());
	
		
	if (totalmarks >= 200 )
	{
		System.out.println("Grade A");
		
	}
	else if  (totalmarks <= 199 && totalmarks >= 150 )
	{
		System.out.println("Grade B");
	}
	else if (totalmarks <= 149 && totalmarks >= 100)

	{
		System.out.println("Grade C");
	}
		
	else 
	{
		System.out.println("Grade D");
	}
}
}

