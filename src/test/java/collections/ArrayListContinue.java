package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListContinue {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("X");
		list.add("Y");
		list.add("Z");
		list.add("A");
		list.add("B");
		list.add("C");
		ArrayList list2=new ArrayList();
		list2.addAll(list);
		System.out.println(list2);
		list2.removeAll(list);
		System.out.println(list2);
		Collections.sort(list);// from Collections class new methods
		Collections.sort(list, Collections.reverseOrder());// to sort in reverse order
		Collections.shuffle(list);// to shuffle randoms
		
		String arr[]= {"Dog","Cat","Tiger"};
		for(String s:arr)
		{
			System.out.println(s);
		}

		ArrayList l=new ArrayList(Arrays.asList(arr));//to convert Array into array list Arrays.aslist(arr);
		System.out.println(l);
		
	}
}
