package CallOtherConstuctor;

public class Person {
	
protected String fname;
protected String lname;
protected String address;
public Person() {
	System.out.println("defoult contructor");
}
public Person(String fn ,String ln){
	fname = fn;
	lname = ln;
	System.out.println("person name:"+ fn+ " " + ln);
}
public Person(String fn , String ln , String addr){
	this(fn , ln);
	address = addr;
	
	System.out.println("person name:"+fn+" "+ln+" "+addr);
  }
public static void main(String[] args) {
	
	Person s = new Person("Prashant", "Jha","Indore");

}
}
