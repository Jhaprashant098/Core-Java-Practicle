package Exception;

public class FinallyNotExcute {
	public static void main(String[] args) {
		
	try{
		int a = 35/0;
		System.out.println(a);
	}
	catch (Exception e){
		System.out.println("finally not Excute");
		
		System.exit(0);
	}
	finally{
		System.out.println("you will not run");
	}
  }
}
