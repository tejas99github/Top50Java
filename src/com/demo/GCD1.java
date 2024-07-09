package com.demo;

import java.util.Scanner;

public class GCD1 {
	// BruteForce apporach
	public static void getGCD(int a, int b) {

		int min = 0;

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println("By Bruteforce approach GCD is: " + i);
				break;
			}
		}

	}

	// Euclid algorithm
	public static int getGCDByEuclid(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	// Enhanced Euclid algorithm
	public static int getGCDByEnhancedEuclid(int a, int b) {

		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first No>> ");
		int a = scanner.nextInt();
		System.out.println("Enter the second No>> ");
		int b = scanner.nextInt();
		getGCD(a, b);
		System.out.println("By Euclid algorithm GCD is: " + getGCDByEuclid(a, b));
		System.out.println("By Enhanced Euclid algorithm GCD is: " + getGCDByEnhancedEuclid(a, b));

		scanner.close();
	}

}
