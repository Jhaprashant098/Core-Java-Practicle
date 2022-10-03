package ReturnType;

public class Tringle extends Shape {
	private int height;
	 private double base;
	 
	 public Tringle(){
	 }
	 
	 public Tringle(int height , int base ){
		 this.height = height;
		 this.base = base;
	 }
	  public int getheight(){
		  return height;}
	  public double getbase(){
		  return base;
		  
	 }
	  public double area(){
		  double hrr = (base*height);
	   return hrr;
		  
	  }

}
