package Prashant.Core.Oop;

public class Circle {
private double PI;
private int radius;
double arr;
public Circle( double PI, int radius) {
	this.PI =PI ;
	this.radius= radius ;
	
}
  public double getPI(){
	return PI;}
	public int getradius(){
		return radius;
}
   public double area(){
	double arr=PI*radius*radius;
	return arr;
	
  }
}
