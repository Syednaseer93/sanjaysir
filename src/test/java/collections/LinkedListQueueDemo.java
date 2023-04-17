package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListQueueDemo {
	//SAME AS PRIORITY QUEUE BUT WE CAN ADD HETEROGENOUS DATA HERE

	
		public static void main(String[] args) {
			LinkedList q=new LinkedList();
			//methods to add elements are add() and offer
			q.add("A");// add() returns true if successful and returns Exception if not
			q.add("B");
			q.add("C");
			q.offer(100);//returns true if succesSful and false if not
			//methods to return header element are element() and peek()
			System.out.println(q.element());// returns NOSUCHELEMENT exception if queue is empty
			System.out.println(q.peek());// returns null is queue is empty
			//methods to return and remove elements are remove() and poll()
			System.out.println(q.remove()); // Returns 1st added ele as output also that element is removed from Queue. so queue is left with B,C,C
			//But is queue is empty remove() will return NOSUCHELEMENT Exception and poll() will return null
			System.out.println(q.poll());
			Iterator it=q.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			/*for(Object o:q)
			{
				System.out.println(o);
			}*/

	}

}
