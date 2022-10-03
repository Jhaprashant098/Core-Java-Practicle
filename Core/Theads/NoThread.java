package Core.Theads;

public class NoThread {
   String name = null;


	
	public NoThread(String n) {
         name = n;
		}
	public void show(){
		for(int i =0; i<50; i++){
			System.out.println(i+name); 
			
		}
	}
}

