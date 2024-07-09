package com.demo;

import java.util.Scanner;

public class PrimeNo2 {

	static boolean checkPrime(int n) {

		if (n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	static void printPrimes(int n) {
		for (int i = 2; i <= n; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the No>> ");

		int n = scan.nextInt();

		// To check given no is prime or not
		System.out.println(checkPrime(n));

		// To print all the prime no till nth F
		printPrimes(n);

		scan.close();

	}

}
