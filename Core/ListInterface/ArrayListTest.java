package Core.ListInterface;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
public static void main(String[] args) {
	
	List a = new LinkedList  ();
	
         a.add(10);
	     a.add(33.6);
	     a.add('n');
	     a.add("Rays");
	      // a.clear();
	   
	     System.out.println(a);
	     
	     System.out.println(a.removeAll(a)); 
	    System.out.println(a.iterator());
	     System.out.println(a.isEmpty());
	     System.out.println(a.contains(86));
          System.out.println(a.containsAll(a));
         System.out.println(a.retainAll(a));
	     System.out.println(a.size());
	     System.out.println(a.addAll(a));
	     System.out.println(a.remove(a));
	   
		   for( Object ele : a ){
			 System.out.println(ele);
		   }
}
}