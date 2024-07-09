package com.demo;

import java.util.Scanner;

//Recursive implementation of Fibonacci Series

public class Fibonacci_Recur {

	// Function to print the fibonacci series
	static int fib(int n) {
		// Base Case
		if (n <= 1) {
			return n;
		}
		// Recursive call
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Nth no : ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}

		scan.close();
	}

}
