package Core.sorting;

import java.util.HashMap;

public class MapIterator{
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("1","one");
		map.put("3","three");
		map.put("2","two");

		
		
	System.out.println(map); // print
	System.out.println(map.size());  // size 
	
	System.out.println(map.get("2"));
	System.out.println(map.get("3"));
	
	System.out.println(map.containsKey("3")); //Searching keys output boolean
	System.out.println(map.containsKey("two")); //seaching keys of string only
	
	System.out.println(map.keySet()); //get keys
	
	System.out.println(map.values()); // get only value of keys
	
   
  }
}
