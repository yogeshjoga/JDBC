package com.yogi.billa;

public class OccaranceOfArray {
	/*
	 * find the frequent numbers in array in the given array
	 * find occaranc of the array numbers
	 */
	
	public static void main(String[] args) {
		int arr[] = new int[] {2,3,6,8,5,2,5,6,8,7,6};
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=i; j<arr.length;j++) {
				if(arr[i] == arr[j]) 
					count++;
			}
			if(count>1)
			System.out.println(arr[i]+" is occurance at "+count);
			
		}
		
		
	}


}
