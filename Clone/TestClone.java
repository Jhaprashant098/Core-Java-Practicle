package Clone;

public class TestClone {
public static void main(String[] args) throws Exception {
	
	Address s =new Address ();
	s.setCity("Indore");
	s.setState("MP");
	s.setStreet("GTB Road");
	
	Employee d = new Employee();
	d.setFname("Prashant");
	d.setLname("Sharma");
	d.setId("3457-4536-5688");
	
	System.out.println(s.getCity());
	System.out.println(s.getState());
	System.out.println(s.getStreet());
	
	System.out.println(d.getFname());
	System.out.println(d.getLname());
	System.out.println(d.getId());

	Address s1 = (Address)s.clone();
    Employee d1 = (Employee)d.clone();
    
	System.out.println(s1.getCity());
	 System.out.println(s1.getState());
	 System.out.println(s1.getStreet());
	 
    System.out.println(d1.getFname());
    System.out.println(d1.getLname());
    System.out.println(d1.getId());
    
   }
}