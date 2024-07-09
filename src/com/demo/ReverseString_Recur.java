package com.demo;

import java.util.Scanner;

// Program to reverse the string using recursion

public class ReverseString_Recur {

	public static String reverseString(String s, String r, int i) {
		if (i < 0) {
			return r;
		}
		return reverseString(s, r + s.charAt(i), i - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String >> ");

		String s = sc.next();

		System.out.println(reverseString(s, "", s.length() - 1));
		sc.close();
	}

}
