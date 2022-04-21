package com.yogi.billa;

public class SmallestAndLargest {
	public static void main(String[] args) {
		/*
		 * smallest and largest
		 */
		int arr[] = new int[] {12,21,453,123,1,543,55,65,65,12324,99};
		int smallest = arr[0];
		int biggest = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(biggest < arr[i]) {
				biggest = arr[i];
			}
		}
		System.out.println("smallest value is : "+smallest+" biggest value is : "+biggest);
	}

}
