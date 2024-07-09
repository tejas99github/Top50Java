package com.demo;

import java.util.Scanner;

// Java program to Find the square root of given numbers

public class Find_Square_Root {

	static int cuberoot(int n) {
		int ans = 0;

		for (int i = 1; i <= n; ++i) {

			// checking every number cube
			if (i * i <= n) {
				ans = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find sq root : ");
		int number = scan.nextInt();
		scan.close();
		// Checking number
		int cuberoot = cuberoot(number);
		System.out.println(cuberoot);
	}
}
/*
 * Input: x = 16 Output: 4 Explanation: The square root of 16 is 4.
 * 
 * Input: x = 5 Output: 2 Explanation: The square root of 5 lies in between 2
 * and 3 so floor of the square root is 2.
 */