package com.Strings;

import java.util.Scanner;

public class NumberOfVowelsInSTring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string value");
		String str = scanner.nextLine();
		int length=0;
		for(char ch: str.toCharArray()) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				length++;
			}
		}
		System.out.println(length);

	}

}
