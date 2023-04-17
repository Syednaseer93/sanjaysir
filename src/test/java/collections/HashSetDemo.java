package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	//NO INSERTION ORDER PRESERVED AND NO DUPLICATES
	//NO INDEX TECHNIQUE UNLIKE LISTS

	public static void main(String[] args) {
		HashSet hs=new HashSet();//default capacity is 16 and load factor is 0.75
		//HashSet<String> hs=new HashSet<HashSet>();
		//HashSet hs=new HashSet(100,(float)0.90); to set load factor 95
		hs.add(100);
		hs.add("welcome");
		hs.add(false);
		hs.add(null);
		hs.add('C');
		hs.remove(null);// to remove(no index technique
		hs.contains("welcome");// to check it contains "welcome" or not
		//Set and get methods not applicable for HashSet
		hs.isEmpty();// to check whether empty
	/*	for(Object o:hs)
		{
			System.out.println(o);
		} */
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
