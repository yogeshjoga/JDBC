package com.Strings;

import java.util.Scanner;

public class StringLengthFind {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		/*
		 * this is for logic
		 * int length = 0; 
		 *  for(char ch :str.toCharArray()) {
		 *  length++;
		 *   }
		 *   System.out.println(length);
		 *   
		 *   this is for like me lazy coders
		 */
		
		System.out.println(str.length());
	}

}
