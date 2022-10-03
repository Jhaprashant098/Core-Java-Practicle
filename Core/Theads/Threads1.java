package Core.Theads;

public class Threads1 extends Thread {

	String name = null;

	public Threads1(String n) {
		name = n;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ":" + name);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
		}
		}

	}
}
