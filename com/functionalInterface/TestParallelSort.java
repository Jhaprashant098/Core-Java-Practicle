package com.functionalInterface;

import java.util.Arrays;

public class TestParallelSort {
	
public static void main(String[] args) {
	
	int [] arr = {5,7,9,4,3,5,9,5,4,6};
	 Arrays.parallelSort(arr);
	 for (int i : arr) {
	System.out.println(i);	
	}
}
}
