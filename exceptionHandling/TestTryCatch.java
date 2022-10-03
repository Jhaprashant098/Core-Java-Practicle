package exceptionHandling;

public class TestTryCatch {
	public static void main(String[] args) {
	String name = null  ;
	try{System.out.println(name.length());
	System.out.println(name.charAt(6));
	
	}catch(NullPointerException e) {
		System.out.println("Name can not match");}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("String is small");
	}
	}

}
