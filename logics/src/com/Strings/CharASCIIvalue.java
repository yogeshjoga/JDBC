package com.Strings;

import java.util.Scanner;

public class CharASCIIvalue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch = scanner.next().charAt(0);
		System.out.println((int)ch);

	}

}
