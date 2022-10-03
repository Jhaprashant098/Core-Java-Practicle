package Polimosphism;

public class TestCircle {
public static void main(String[] args) {
	
	Shape s = new Circle(5);

	Shape x =new Shape("red" ,2);
	
	
	System.out.println(s.area());	
	
	
	
	System.out.println(x.getBorderWidth());
	System.out.println(x.getColor());
}
}
