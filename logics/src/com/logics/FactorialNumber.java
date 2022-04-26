package com.logics;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// fact
		 int sum =1;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number to calculate the fact..");
		 int num = scanner.nextInt();
		 for(int i=1; i<=num; i++) {
			 sum = sum*i;
		 }
		 System.out.println("the fact of : "+num+" is "+sum);
		
	}
}
