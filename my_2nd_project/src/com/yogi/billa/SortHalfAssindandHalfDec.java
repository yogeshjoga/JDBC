package com.yogi.billa;

import java.security.PublicKey;

public class SortHalfAssindandHalfDec {
	int arr[] = new int[] {1,32,65,6543,654,12};
	
	
	public void dec() {
		int dec = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					dec = arr[i];
					arr[i]=arr[j];
					arr[j]=dec;
				}
			}
		}
		for(int i=0; i<arr.length/2; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public void asc() {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length/2; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public static void main(String[] args) {
		
   SortHalfAssindandHalfDec objAssindandHalfDec = new SortHalfAssindandHalfDec();
   objAssindandHalfDec.asc();
   objAssindandHalfDec.dec();
   
   
}
}
