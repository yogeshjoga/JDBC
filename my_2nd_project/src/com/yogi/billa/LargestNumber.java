package com.yogi.billa;

import java.util.Arrays;
import java.util.Collections;



/*
 * if we want to sort assending order directly we can use
 * if we want to decending reverse order we want to use wapper classes
 * so Integer in place of int we can write 
 */


public class LargestNumber {
	 public static void main(String[] args) {
		int[] arr =  new int[]{ 2,4,5,3,1,6,7,8,22};
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) { 
			System.out.println(arr[i]);		
		}
		
	}
}



