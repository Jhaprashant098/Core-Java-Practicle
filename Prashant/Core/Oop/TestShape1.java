package Prashant.Core.Oop;

public class TestShape1 {
	public static void main(String[] args) {
		
		Shape1 sp = new Shape1("red" ,7);
		
		int a = sp.getBorderWidth();
		String e = sp.getColor();
		
		System.out.println(a);
		System.out.println(e);
		
		System.out.println(sp.getBorderWidth());
		System.out.println(sp.getColor());
		
	}

}
