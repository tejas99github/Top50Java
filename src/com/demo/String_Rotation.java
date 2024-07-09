package com.demo;

import java.util.Scanner;

//Check if two string rotation of each other

/*A String is said to be a rotation of other string if they contain same characters and the sequence is rotated across any character, 
 e.g. "dabc" is a rotation of "abcd" but "dbac" is not. */

public class String_Rotation {

	public static boolean areRotations(String str1, String str2) {

		// Check if both strings have the same length
		if (str1.length() != str2.length()) {
			return false;
		}
		// Concatenate str2 with itself
		String temp = str2 + str2;

		// Iterate through the concatenated string
		for (int i = 0; i <= temp.length() - str1.length(); i++) {
			boolean found = true;
			// Check if str1 matches the substring starting at index i
			for (int j = 0; j < str1.length(); j++) {
				if (temp.charAt(i + j) != str1.charAt(j)) {
					found = false;
					break;
				}
			}
			// If str1 is found as a substring, return true
			if (found) {
				return true;
			}
		}
		// If str1 is not found as a substring, return false
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String string1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String string2 = scanner.nextLine();

		if (areRotations(string1, string2)) {
			System.out.println("The strings are rotations of each other.");
		} else {
			System.out.println("The strings are not rotations of each other.");
		}

		scanner.close();
	}
}
