package Core.ListInterface;

import java.util.List;
import java.util.Vector;

public class VectorList {
	public static void main(String[] args) {
		
		List s = new Vector();
		s.add(24);
		s.add(4.6);
		s.add('b');
		s.add("honey");
		
		System.out.println(s);
		
		//System.out.println(s.get(1));
		//System.out.println(s.remove(3));
	  //  System.out.println(s.set(0, 2));
	  
		//System.out.println(s.subList(0, 2));
	//System.out.println(s.subList(0, 3));
	
    	// System.out.println(s.indexOf('b'));
    	// System.out.println(s.indexOf(24));
	
	//	System.out.println(s.lastIndexOf("honey"));
	
	}
}
