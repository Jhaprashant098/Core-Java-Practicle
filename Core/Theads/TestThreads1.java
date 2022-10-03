package Core.Theads;

public class TestThreads1 extends Thread {
	public static void main(String[] args) throws Exception {

		Threads1 m1 = new Threads1("Radhe");

		Threads1 m2 = new Threads1("Krishna");
		
		m1.start();
		m2.start();
		
		for(int i = 0 ; i<10; i++){
			System.out.println("Java");
		}
	
	}
}
