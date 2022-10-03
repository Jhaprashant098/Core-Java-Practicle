package Core.Theads;

public class TestPriorityThread extends Thread {

	String name= null;
	
	public TestPriorityThread(String n){
		name =n;
	}
	public void run(){
		
		for(int i=0; i<200; i++){
	System.out.println(name+":"+getPriority());		
		}
	}
	public static void main(String[] args) throws Exception {
		
		TestPriorityThread s1 =new TestPriorityThread("Prashant");
		TestPriorityThread s2 =new TestPriorityThread("Jha");
	
		s1.setPriority(6);
		s2.setPriority(8);
		
		s1.start();
		s2.start();
	}

}
