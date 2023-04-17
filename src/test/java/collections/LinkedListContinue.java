package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListContinue {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		LinkedList l2=new LinkedList();
		l2.addAll(l); //Adding all elements into a duplicate or new LinkedList
		l2.removeAll(l); // to remove all added elements from new LinkedList
		Collections.sort(l);//to sort
		Collections.sort(l,Collections.reverseOrder());//Sort in reverse Order
		Collections.shuffle(l);  // to shuffle
		String arr[]= {"Nas","mah","Sam"};
		for(String s:arr)
		{
			System.out.println(s);
		}
	 LinkedList l3=new LinkedList(Arrays.asList(arr));//converting Array to LinkedList
	// System.out.println(l3);
	 

	}

}
