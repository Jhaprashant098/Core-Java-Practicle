package StreamVsCollection;

import java.util.ArrayList;

public class TestClass {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(5);
		a.add(6);
		a.add(55);
		a.add(6);
		a.add(3);
		a.add(8);
		a.add(3);
		a.stream().sorted().forEach(li->System.out.println(li));
	}

}
