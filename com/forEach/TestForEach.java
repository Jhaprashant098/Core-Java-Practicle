package com.forEach;

import java.util.ArrayList;

public class TestForEach {
	public static void main(String[] args) {
		ArrayList ss = new ArrayList();
		
		ss.add(3);
		ss.add(6);
		ss.add(7);
		ss.add(9);
		ss.add(3);
		ss.add(13);
		ss.forEach(li -> System.out.print(li));
		
	}
}
