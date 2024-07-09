package com.demo;

import java.util.Scanner;

public class PrimeNo1 {

	static boolean isPrime(int n) { // 8

		// First factor will come somewhere at the max root n or before
		for (int i = 2; i <= Math.sqrt(n); i++) { // 2,
			if (n % i == 0) { // 8%2=0
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the No>> ");

		int n = scan.nextInt();

		System.out.println(isPrime(n));

		scan.close();
	}

}
