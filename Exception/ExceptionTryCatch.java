package Exception;

public class ExceptionTryCatch {
	public static void main(String[] args) {
		int a = 15; 
		int b = 0;
	try{
		String name = null;
		System.out.println(name.length());
	
		try{ 
			double div = a/b;
			System.out.println(div);
		}
		catch(Exception e){
			System.out.println();
			}
	}catch(Exception e)
		{System.out.println("a is not divisible by b");
	}finally {
		System.out.println("String khali hai");
	}
	try { double c = 50/0;
	System.out.println(c);
	}catch(Exception e){
		System.out.println("50 is not divisible by 0");
		
	}
	}
}