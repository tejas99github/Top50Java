package com.demo;

import java.util.Scanner;

//A Simple Iterative Java program to reverse a string

class ReverseString_Iter {

	static String rev = "";

	// Function to reverse a string
	static void reverseStr(String str) {
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		
		System.out.println("Reverse String is >>"+rev);
	}

	// Driver program
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String >");

		String str = sc.next();

		reverseStr(str);
		sc.close();
	}
}
