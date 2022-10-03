package Core.Theads;
public class TestThreadRunnable   {
	public static void main(String[] args) throws Exception {
	
	ThreadRunnable s1 = new ThreadRunnable("Ram");
	ThreadRunnable s2 = new ThreadRunnable("Shyam");
		
	
	Thread tt = new Thread(s1);
	Thread th = new Thread(s2);
	
	tt.start();
	th.start();
   }
}
