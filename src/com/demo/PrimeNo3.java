package com.demo;

import java.util.Scanner;

public class PrimeNo3 {

	// Sieve Of Eratosthenes algorithm to print prime number

	static void sievePrintPrimer(int n) {

		boolean[] prime = new boolean[n + 1]; // index represent the no so +1

		for (int i = 2; i * i <= n; i++) {

			if (prime[i] == false) {

				for (int j = i * i; j <= n; j = j + i) {
					prime[j] = true;
				}

			}

		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the no>> ");

		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();

		sievePrintPrimer(i);

		scan.close();

	}
}