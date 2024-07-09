package com.demo;

import java.util.Scanner;

public class String_Anagram {

	// Custom sorting algorithm (Bubble Sort)
	public static void sort(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First String ");
		String str1 = obj.nextLine();
		System.out.println("Enter Second String");
		String str2 = obj.nextLine();
		obj.close();

		// Check if lengths of strings are equal
		if (str1.length() != str2.length()) {
			System.out.println("false");
			return;
		}

		// Convert strings to character arrays
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		// Sort character arrays using a custom sorting algorithm
		sort(ch1);
		sort(ch2);

		// Compare sorted arrays character by character
		boolean areAnagrams = true;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				areAnagrams = false;
				break;
			}
		}

		// Print result
		System.out.println(areAnagrams);
	}

}
