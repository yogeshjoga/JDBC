package com.yogi.billa;

import javax.xml.transform.Templates;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = new int[] {1,23,43,443,9};
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			if(temp < arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println(temp);
	}

}
