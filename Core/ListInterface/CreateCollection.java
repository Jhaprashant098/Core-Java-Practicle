package Core.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class CreateCollection {
	public static void main(String[] args) {
		
		   List l = new ArrayList<>();
		   
		   l.add(4);
		   l.add(35);
		   l.add('a');
		   l.add("java");
		                    
		   System.out.println(l);
		
		   for( Object ele : l ){
			 System.out.println(ele);
		 }
		   }
	}
