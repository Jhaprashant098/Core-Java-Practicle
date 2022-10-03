package Prashant.Core.Oop;

public class TestShape {

	public static void main(String[] args) {
		
		Shape sg = new Shape();
		 sg.setColor("red");
			 System.out.println("color:"+sg.getColor()); 
			 
	      Shape sg1 =new Shape();
	      sg1.setDate("29/07/2022");
	      System.out.println("Date:"+sg1.getDate());
	
	      Shape sg2 =new Shape();
	      sg2.setAddress("prestise tower 302 A");
	      System.out.println("Address:"+sg2.getAddress());
	      
	      Shape sg3 =new Shape();
	      sg3.setDob("06/02/2000");
	      System.out.println("Dob:"+sg3.getDob());
	      
	      Shape sg4 =new Shape();
	      sg4.setAge("22");
	      System.out.println("Age:"+sg4.getAge());
	     
}
}
