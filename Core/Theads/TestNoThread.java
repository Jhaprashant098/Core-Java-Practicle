package Core.Theads;

public class TestNoThread {
	
	public static void main(String[] args) {
		
		NoThread s1 = new NoThread("ram");
		NoThread s2 = new NoThread("shyam");
	
		s1.show();
		s2.show();
	}

}
