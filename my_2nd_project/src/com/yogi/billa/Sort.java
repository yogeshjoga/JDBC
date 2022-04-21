package com.yogi.billa;

public class Sort {
	public static void main(String[] args) {
		int []arr = new int[]{22,43,5,555,67,23,663,675,34,12,64};
		int temp =0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i]> arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
