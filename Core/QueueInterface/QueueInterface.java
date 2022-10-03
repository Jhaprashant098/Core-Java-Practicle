package Core.QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		
		Queue a = new PriorityQueue (); 
//	
//	a.add(8);
//	a.add(5);
//	a.add(7);
//	a.offer(11);
//   a.add('a');
 // 	a.add('b');
 
		 a.add("two");
		 a.add("three");
	   a.add("one");	
//	
	
	
	// System.out.println(a.offer(2)); //add element accending
	
	// System.out.println(a.remove()); // retrive and remove element accending
	 // System.out.println(a.remove());

     //System.out.println(a.poll());  //remove --''--
// System.out.println();

	// System.out.println(a.element()); //retrive but does not remove
	// System.out.println(a.element());
	 
	//System.out.println(a.peek()); //retrive same element and does not remove
	//System.out.println(a.peek());

	System.out.println(a);
	}
}
