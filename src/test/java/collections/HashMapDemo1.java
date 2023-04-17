package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
	//UNDERLYING DATASTRUCTURE IS HASHTABLE, AND WORKS ON KEY, VALUE PAIRS 
	//INSERTION ORDER NOT PRESERVED,DUPLICATE KEYS ARE ALLOWED BUT NOT VALUES, NULL KEY IS ALLOWED ONCE BUT NULL VALUES CAN BE MANY
	//heterogenous data can be used

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap <Integer,String>(); //must be with Key, value pairs
		hm.put(1,"Aa");
		hm.put(2,"ba");
		hm.put(3,"Cc");
		hm.put(4,"dd");
		System.out.println(hm);
		System.out.println("Adding New Value:");
		hm.put(5,"ee");                                 //use put to add values but no index concept and wont be added in middle of hashmap
		System.out.println(hm);
		System.out.println("Removing value");

		hm.remove(5); 
		System.out.println(hm);

		System.out.println("HashMap using Enhanced For Loop:  ");
		for(Map.Entry m:hm.entrySet()) //hm.entrySet() will take pairs from hashmap one by one and store that value in variable named m. m will use getKey() and getVlaue() to retrive
		{                                             //..values and print 1,"Aa. 
			System.out.println(m.getKey()+"  "+m.getValue());

		}

	}
}
