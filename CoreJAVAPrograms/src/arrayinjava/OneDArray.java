package arrayinjava;

public class OneDArray {

	public static void main(String[] args) 
	{
		int student_id[] = new int[5];
		
		student_id[0] = 100;
		student_id[1] = 200;
		student_id[2] = 300;
		student_id[3] = 400;
		student_id[4] = 500;
		
		int Sizeofarray = student_id.length;
		System.out.println("print the lenght of array :" +Sizeofarray);
		
		 for (int i=0; i<Sizeofarray; i++)
		{
			System.out.println("print the array value is : " +student_id[i]);
		} 

		 /* int i = 0;
		while (i<Sizeofarray)
		{
			System.out.println("print the array value is : " +student_id[i]);
			i++;
		}*/
	}

}
