package exceptionHandling;

public class TestLoginException  {
public static void main(String[] args) {
	
	try {
		throw new LoginException("THIS IS ONLY LOGIN EXCEPTION");
	}
catch(Exception t){
	System.out.println(t.getMessage());
}
	}
	}
