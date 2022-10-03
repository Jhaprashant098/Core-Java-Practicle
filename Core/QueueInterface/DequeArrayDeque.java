package Core.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArrayDeque {
	public static void main(String[] args) {
		
		Deque p = new ArrayDeque ();
		p.add(2);
		p.add(17);
		p.add('d');
		p.add("aram");
		p.add("karo");
		p.offer(14);
		p.addFirst(25);
		p.addLast(21);
		//p.removeFirst();
		
		System.out.println(p);

		Deque p2 = new ArrayDeque ();
		p2.add(2);
		p2.add(17);
		p2.add(11);
		p2.add(7);
		p2.add(8);
		p2.offer(14);
		
		System.out.println(p2);
		
		// System.out.println(p.getFirst()); //first value
		
		// System.out.println(p.getLast());  // last value

		// System.out.println(p.removeLast()); // remove last value
		// System.out.println(p.removeLast()); // remove last value again
	
		System.out.println(p);

	}

}
