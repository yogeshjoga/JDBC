package com.recusrsion.logics;


import java.util.Scanner;

public class PowerNumber {
	
	/*
	 * this is the recursion method calling statement
	 * so we can call by using method self calling statement only
	 */
	
	
	public int powerNum(int base, int exponent) {
		/*
		 * this is the recursive method so we can call this method 
		 * by using return statement
		 */
		if(exponent == 0) {
			return 1;
			/*
			 * if exponent is 0 it will take the 1
			 * 1 time multiplying with base number
			 */
		}
		else if (exponent > 0) {
			/*
			 * if exponent is grather-then zero it will recursion 
			 * self calling method will activate
			 * 
			 * in return statement base * (multiplys exponent times) as well as exponent will decreased
			 */
			return base * powerNum(base, exponent-1);
		}
		return exponent;
		//finial return is exponent 
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner class
		int base = scanner.nextInt();
		int exponent = scanner.nextInt();
		PowerNumber powerNumber = new PowerNumber(); //object
		System.out.println(powerNumber.powerNum(base,exponent));
		//syso to print method with arguments 
	}

}
