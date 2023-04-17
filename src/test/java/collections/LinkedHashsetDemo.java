package collections;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet(); // ONLY DIFFERENCE IS INSERTION PRESERVED UNLIKE HASHSET
	//	LinkedHashSet lh=new LinkedHashSet(1000,0.95);
		lh.add(100);
		lh.add(200);
		lh.add(300);
		lh.add(300);//Duplicates not allowed
		System.out.println(lh);
		//the methods are same as hashset

		
		
	}

}
