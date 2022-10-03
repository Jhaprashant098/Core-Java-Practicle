package Core.Theads;

public class TestThread extends Thread {

	private String name = null;
	
	public TestThread(String n){
	  name = n ;
	}
	public void run(){
		for(int i=0; i<50; i++){
			System.out.println(i+":"+name);
		}
	}
	public static void main(String[] args) throws Exception {

		TestThread s1 = new TestThread("Ram");
		TestThread s2 = new TestThread("Sita");
		
		s1.start();
		s2.start();
	}
}
