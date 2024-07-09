package com.demo;

import java.util.Scanner;

//Iterative Approach to Print Fibonacci Series in Java
public class Fibonacci_Itr {

	// Function to print N Fibonacci Number
	static void Fibonacci(int N) {	//7, 
		int num1 = 0, num2 = 1;

		int counter = 0;

		// Iterate till counter is N
		while (counter < N) {		// 0<7, 1<7, 2<7, 3<7, 4<7, 5<7 6<7
			// Print the number
			System.out.print(num1 + " ");	//0, 1, 1, 2, 3, 5, 8

			// Swap
			int num3 = num2 + num1;			//1, 2, 3, 5, 8, 13, 21
			num1 = num2;					//1, 1, 2, 3, 5, 8,
			num2 = num3;					//1, 2 ,3, 5, 8, 13,
			counter = counter + 1;
		}
	}

	// Driver Code
	public static void main(String args[]) {
		System.out.println("Enter the No>>> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// Function Call

		Fibonacci(N);		// 7
		sc.close();
	}
}
