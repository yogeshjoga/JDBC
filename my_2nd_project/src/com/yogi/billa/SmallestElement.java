package com.yogi.billa;

public class SmallestElement {
	public static void main(String[] args) {
		/*
		 * find the smallest element in the arrays
		 * 
		 */
		int arr[] = new int [] {23,1,32,54,5456,89};
		int temp = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(temp > arr[i]) {
				temp =arr[i];
			}
		}
		System.out.println(temp);
	}
}
