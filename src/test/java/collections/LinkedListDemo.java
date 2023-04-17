package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(100);    
		l.add("Naseer");
		l.add('C');
		l.add(false);
		l.add(null);
		l.add(15.5);
		System.out.println(l.size());//For Size
		l.remove(0);//remove element
		l.add(2,"Maheer");//add in middle
	    l.get(0);//get element
	  //  l.set(0, l);//replace value
	    l.contains("Maheer");// to check is that element is present in linked list
	    l.isEmpty();// to check is list is empty
	    System.out.println(l);
	/*   for(int i=0;i<l.size();i++)
	   {
		  System.out.println(l.get(i)); 
	   } */
	/*   for(Object o:l)
	   {
		   System.out.println(o);
	   } */
	 /*   Iterator it=l.iterator();      //Different ways of retreivel
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    } */
	    
	    
	    
		
	}

}
