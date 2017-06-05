package listoperationsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shufflinginarray {

	public static void main(String[] args) 
	{
		
	List<Integer> numbers = new ArrayList<>();
	for (int i=0; i<=10; i++)
		numbers.add(i);
		System.out.println("List before shuffling: " + numbers);
		Collections.shuffle(numbers);
		System.out.println("List after shuffling: " + numbers);
		
	
		
	
	}
	
}
