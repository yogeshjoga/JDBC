package com.Strings;

import java.util.Scanner;

public class CharIsAlphaOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		if(ch>= 'a' && ch<='z' || ch>='A'&& ch<='Z') {
			System.out.println("alpha");
		}
		else {
			System.out.println("it is not a alpha");
		}

	}

}
