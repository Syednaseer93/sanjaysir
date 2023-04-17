package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	//HERE SHOWING ALL HASHMAP METHODS and WAYS OF RETRIVAL THATS ALL

	public static void main(String[] args) {

		HashMap hm=new HashMap();

		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(8, 300);
		hm.put(4, 400);
		hm.put(5, 500);
		hm.put(9, 800);
		HashMap hm2=new HashMap();
		hm2.putAll(hm);// adds all elements in new hashmap hm2

			System.out.println("gets perticular value by entering key"+hm.get(8)); //gets that particular value present in that key
			System.out.println("enter the key and removes that key value pair"+hm.remove(4));// to remove that pair
			System.out.println("check if that key is present"+hm.containsKey(1)); //returns true if that key is present
			System.out.println("check if that value is present"+hm.containsValue(200)); //returns true is that value is present
			System.out.println("check id hashmap is empty"+hm.isEmpty());//returns true is hashmap is empty
			hm.size(); //for size
			hm.clear(); //deletes complete hashmap
			System.out.println(hm.keySet());// return all keys. HERE SET IS USED BECAUSE KEYS WILL HAVE NO DUPLICATES, WE HAVE SEEN IN SETS CONCEPT
			System.out.println(hm.values());// RETURNS ALL VALUES, INCLUDING DUPLICATES
			System.out.println(hm.entrySet());// returns all key values in pairs or set objects
		/* ENTRY INTERFACE EXPLAINED:
		 * NORMALLY ENTRY IS KEY AND VALUE TOGETHER, MAP IS COLLECTION OF ENTRIES
		 * HASHMAP INTERFACE HAS ANOTHER INTERFACE INSIDE IT NAMED AS 'ENTRY' Where this ENTRY HAS ITS OWN METHODS TO RETRIEVE KEY Value pairs
	 getkey() , getvalue(), setvalue() BASICALLY USED TO GET AND SET PERTICULAR VALUE AND KEY*/

		for(Object o:hm.keySet()) // to return all keys only
		{
			System.out.println(o);
		}
		for(Object o:hm.values()) // to return all values
		{
			System.out.println(o);
		}
		for(Object o:hm.keySet())
		{
		//	System.out.println(o+"  "+hm.get(o));// key will go and get stored in o, o will print key and followed by get(o), 
		  //    which gives value present at that key.
			
			/* USING ENTRY INTERFACE for retreival
			 * entrySet() will store every entry in an object e, which is Map.Entry type, this e will have methods getkey() and getvalue()
			 make sure to use this: HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
			for(Map.Entry e:hm.entrySet())
			{
				System.out.println(e.getKey()+"  "+e.getValue() );
			} */
			Set s=hm.entrySet();
			Iterator it=s.iterator(); //REFER Haha file for clear understandind
			while(it.hasNext())
			{
				Map.Entry e=(Entry) it.next();
				System.out.println(e.getKey()+"  "+e.getValue());
			}
			
		
				
			
			
		}
	}

}
