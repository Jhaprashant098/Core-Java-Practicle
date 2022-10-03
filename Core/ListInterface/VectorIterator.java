package Core.ListInterface;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {
	public static void main(String[] args) {
		
		Vector l = new Vector();
		
		l.add("one");
		l.add("three");
		l.add("two");
//		l.add(2);
//		l.add(7);
//		l.add(5);
//		l.add('b');
//		
		System.out.println(l);

		Iterator it = l.iterator();
		
	while(it.hasNext()){
		
		Object obj =  (Object) it.next();
			   
		System.out.print(" "+obj);
	   
	}
	}

}
