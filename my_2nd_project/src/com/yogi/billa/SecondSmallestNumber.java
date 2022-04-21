package com.yogi.billa;

public class SecondSmallestNumber {
		public static void main(String[] args) {
			int arr[] = new int[] {1,2,3,4,5,6,7,8,9,100};
			int temp = arr[0];
			for(int i=0; i<arr.length; i++) {
					if(temp > arr[i]) {
						temp = arr[i];
					}
			}
			
			int num = temp;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != temp && arr[i] < num) {
					num = arr[i];
				}
			}
		
			System.out.println(num);
		}
}
