package sanjaysir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add("Hello");
		list1.add(123);
		list1.add(true);
		list1.add('A');
		list1.add("XXX");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("ZZZ");
		list2.add("XXX");
		list2.add("YYY");
		Collections.sort(list2);
		System.out.println("size of list2 is"+list2.size());
		System.out.println("sorted list 2 is"+list2);
		
		list1.remove(4);
		System.out.println("after removing 'XXX' from list1"+list1);
		System.out.println("size of list 1 after removing XXX"+list1.size());
		
		if(list1.contains(true)) {
			System.out.println("true present");
		}
		else {
			System.out.println("true not present");
		}
	
		System.out.println("list1 follows as per iterator: ");
		Iterator<Object> it = list1.iterator();
		while(it.hasNext()) {
		 System.out.println(it.next()); 
		}
		
	    List<Integer> list3 = Arrays.asList(30,20,60,90,10);
	   Collections.sort(list3);
	   System.out.println("list3"+list3);
		
		for(int i:list3) {
			System.out.println(i);
		}
	//	Collections.sort(list3,Collections.reverseOrder());
		System.out.println("reverse order list3"+list3);
		System.out.println("list3 index of 90:"+list3.indexOf(90));
	}


}
