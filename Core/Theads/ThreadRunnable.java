package Core.Theads;

public class ThreadRunnable implements Runnable {
	
	private String name = null;
	
	public ThreadRunnable(String n){
		name = n;
	}
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println(i+" "+name);
		}
	}
}

