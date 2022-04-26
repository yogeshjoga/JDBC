package com.logics;

import java.util.Scanner;

public class LeftPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your pattern length");
		int len = scanner.nextInt();
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
		System.out.println();
		}
	}

}
