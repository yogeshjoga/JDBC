package com.logics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
	//	int a = 5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd");
		int a = scanner.nextInt();
		 if(a % 2 == 0) {
			 System.out.println(a+" It is an even number ");
		 }
		 else {
			 System.out.println(a+" It is an Odd number ");
		 }

	}

}
