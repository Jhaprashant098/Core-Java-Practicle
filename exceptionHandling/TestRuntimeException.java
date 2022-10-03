package exceptionHandling;

public class TestRuntimeException {

	public static boolean isValidUser() {
		return false;
	}
	public static void main(String[] args) {
	boolean userFound = isValidUser();
	
	if(userFound) {
		System.out.println("valid user");
	}else {RuntimeException e =new RuntimeException("Invalid User");
throw e;
	}
}
}