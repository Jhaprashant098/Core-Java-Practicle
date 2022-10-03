package com.Anonymous;

  public class TestLambda {
	public static void main(String[] args) {
		LambdaFunction add =(a,b) ->{
			return a+b;
		};
		
		System.out.println(add.calc(30, 40));
		
	LambdaFunction sub = (a, b)->{
		return a-b;
	};
	System.out.println(sub.calc(64, 37));

	LambdaFunction mul = (a, b)->{
		return a*b;
	};
	System.out.println(mul.calc(46, 6));
	
	}
}
