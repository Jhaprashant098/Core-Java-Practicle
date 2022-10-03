package Exception;
public class TestFinallyBlock {
public static void main(String[] args) {
	
try{ String name = null ;
		System.out.println(name);
	}
	catch(Exception e)
	{
		System.out.println("exception run");
	}finally {System.out.println("String khali hai");
	}
   }
}
