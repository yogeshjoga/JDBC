package com.logics;

public class CrossChuck {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j && j==i) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		System.out.println("\n completed the cross pattern congratulations....");

	}

}
