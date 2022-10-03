package exceptionHandling;

public class TestTryCatchCatch {
public static void main(String[] args) {
	String name = "vijay";
	try {System.out.println(name.length());
	System.out.println(name.charAt(5));}
	catch(NullPointerException e) 
	{System.out.println("Value can not be null");
	}
	catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
}
}
