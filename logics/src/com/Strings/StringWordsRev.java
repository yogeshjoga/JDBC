package com.Strings;

import java.util.Scanner;

public class StringWordsRev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String []arr = scanner.nextLine().split(" ");
		String rev = "";
		for(int i=arr.length-1;i>=0;i--) {
			rev += arr[i]+" ";
		}
		System.out.println(rev);
		scanner.close();

	}

}
