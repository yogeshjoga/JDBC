package com.logics;

public class RightPattern {

	public static void main(String[] args) {
		int space =5;
		for(int i=1; i<=5; i++) {
			space--;
			for(int j=space; j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
