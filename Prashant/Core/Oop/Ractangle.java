package Prashant.Core.Oop;

public class Ractangle {
 private int length;
 private int wid;

  public Ractangle(int length , int wid ){ 
  this.length = length;
  this.wid = wid;
  }
  public int getlength(){
	  return length;}
  public int getwid(){
		  return wid;}
	  
	  public double area(){
		  double brr= length*wid;
		  return brr;
  }
}
