package javacodingpacks;

import java.util.Scanner;

public class PrimeNumebr {

	
	 
	public static void main(String args[])
    {
		 int num;
		 int i;
		 int count=0;
      	 Scanner scan = new Scanner(System.in);
		
       System.out.print("Enter a Number : ");
      num = scan.nextInt();
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}



	
	   	
