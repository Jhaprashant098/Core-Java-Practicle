package com.Anonymous;

public class TestAnonyfunctional {
	public static void main(String[] args) {
	HelloInt aFun = new HelloInt() {
		
	  public void say() {
		System.out.println("hello anonymous funtions");
	}
	  
 };
 aFun.say();
}
}
