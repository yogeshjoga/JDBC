package com.yogi.billa;


public class BobbleSort {
        public static void main(String[] args) {
			int arr[] = new int [] {12,1213,445,6654,67,4,3,1,9,8,6232,88,99,322,909};
			int temp = 0;
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]= temp;
					}
				}
				
					
				}
			for(int i =0; i<arr.length;i++) {
				System.out.println(arr[i]);
					
				}
			
			}
}
