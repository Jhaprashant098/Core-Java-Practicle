package Core.QueueInterface;

import java.util.LinkedList;

import java.util.Queue;

 public class QueueLinked {

public static void main(String[] args) {
		
		Queue a = new LinkedList(); 
	
		 a.offer(11);
	a.add(8);
	a.add(5);
	a.add(7);
   
//	a.add('a');
//	a.add('b');
      a.add("one");
	   a.add("two");
	   a.add("three");

	
//	 System.out.println(a.remove()); // retrive and remove element accending
//	  System.out.println(a.remove());
//	  System.out.println(a.remove()); 
//	  System.out.println(a.remove()); 
//	  System.out.println(a.remove()); 
//	  
     //System.out.println(a.poll());  //remove --''--
// System.out.println();

//	 System.out.println(a.element()); //retrive same element but does not remove
//	 System.out.println(a.element());
//	 
//	System.out.println(a.peek()); //retrive same element and does not remove
//	System.out.println(a.peek());

	System.out.println(a);
	}
}



