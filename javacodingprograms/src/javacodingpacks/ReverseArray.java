package javacodingpacks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ReverseArray {

	public static void main(String[] args) {
		
		
		String typesOfInsurance [] = {"Life Insurance", "Car Insurance", "Health Insurance"}; 
		
			
		List<String> listOfProducts = Arrays.asList(typesOfInsurance); 
		
		System.out.println("array before reverse : "+listOfProducts);
		
		Collections.reverse(listOfProducts); 
		
		listOfProducts.toArray(typesOfInsurance); 
		
	//	System.out.println("array after reverse: " + Arrays.toString(reversed) );
		
		System.out.println("array before reverse : "+listOfProducts);

				

	}

}
