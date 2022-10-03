package Polimosphism;

public class Rectangle extends Shape {
	private int length;
	private int wid;
	
	public Rectangle(){
	
	}
	public  Rectangle(int length , int wid){
		this.length = length;
		this.wid = wid;
	}
	public double area(){
		double brr = length*wid;
		return brr;
	}

}
