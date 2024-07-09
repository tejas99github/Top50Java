package com.demo;

import java.util.Scanner;

//Program To Check If A String Is Palindrome Using Recursion

public class String_Palindrome_Recur {

	static boolean isPalindrome(String s, int i, int j) {

		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		if (j <= i) {
			return true;
		}
		return isPalindrome(s, i + 1, j - 1);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String to check it is palindrome or not >> ");

		String s = scan.next();

		System.out.println(isPalindrome(s, 0, s.length() - 1));
		
		scan.close();
	}

}
