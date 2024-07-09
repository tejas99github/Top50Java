package com.demo;

import java.util.Scanner;

public class Fibonacci_Recursive {
	
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibo(int count) { // 5

		if (count > 0) { // 5>0 , 4>0, 3>0, 2>0, 1>0
			n3 = n1 + n2; // 1, 2, 3, 5, 8,
			n1 = n2; // 1, 1, 2, 3, 5,
			n2 = n3; // 1, 2, 3, 5, 8,
			System.out.print(" " + n3); // 1, 2, 3, 5, 8
			printFibo(count - 1); // 4, 3, 2, 1,0
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the number >> ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		int count = s;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibo(count - 2);// n-2 because 2 numbers are already printed
		// 7-2=5
	}
}