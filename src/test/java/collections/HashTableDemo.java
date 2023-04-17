package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashTableDemo {
	//Nulls not allowed unlike hashmap
	//insertion order not preserved
	//key no duplicates but not values

	public static void main(String[] args) {
		Hashtable t=new Hashtable();//default capacity 11 and 0.75 load factor
	//	Hashtable h=new Hashtable(100,0.95);
	//	Hashtable <Integer,String>h=new Hashtable<Integer,String>();
		t.put(101,"John");
		t.put(102, "Smith");
		t.put(103, "Kim");
       	//	t.get(101); gets value
		//t.remove(101);
	//	t.containsKey(102); returns true or false
	//	t.containsValue("Smith"); returns value
	//	t.isEmpty();returns false
	//	t.keySet(); returns all keys as set object
	//t.values(); returns all values
		//t.entrySet(); returns key value pairs
		for(Object o:t.keySet())
		{
			System.out.println(o+"  "+t.get(o));
		}
	//	Entry specific methods
	/*	for(Map.Entry entry:t.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		} */
	/*	Set s=t.entrySet();
	    Iterator it=s.iterator();
	    while(it.hasNext())
	    {
	    	Map.Entry entry=(Entry)it.next();
	    	System.out.println(entry.getKey()+"  "+entry.getValue());
	    	
	    } */
	    
		
		
		
		

	}

}
