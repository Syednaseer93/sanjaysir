package collections;

import java.util.HashSet;

public class HashsetContinue2 {

	public static void main(String[] args) {
		// UNION, INTERSECTION, DIFFERENCE
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		 
		HashSet<Integer>hs2=new HashSet<Integer>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		
		hs.addAll(hs2); //UNION
		System.out.println("UNION"+hs);
		hs.retainAll(hs2);//INTERSECTION
		System.out.println("INTERSECTION"+hs);
		System.out.println(hs.removeAll(hs2));//DIFFERENCE
		hs.containsAll(hs2);// returns	subset
		System.out.println(hs);
	

		
		

	}

}
