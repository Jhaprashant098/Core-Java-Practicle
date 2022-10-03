package com.coreBasic;

import java.util.ArrayList;

public class ForEach {
	public static void main(String[] args) {
		
		int[] numbers = {3,7,5,6,9,7,9};
		
		for(int a : numbers) {
			System.out.println(a);
		}
	ArrayList <String> list= new ArrayList<String>();
	list.add("1");
	list.add("4");
	list.add("2");
	list.add("3");
	
	for(String plus : list) {
		System.out.print(plus);
	}
	}
}
