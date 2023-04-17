package collections;

import java.util.HashSet;

public class HashsetContinue {

	public static void main(String[] args) {
		HashSet<Integer> evennumber=new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.addAll(evennumber);
		numbers.add(10);
		numbers.removeAll(evennumber);
		System.out.println(numbers);

	
		
	}

}
