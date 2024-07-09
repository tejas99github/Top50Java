package com.demo;
//Java program to reverse a number and find if it is a palindrome or not using iteration

// Driver Class

public class Int_Palindrome_Itr {

	// Iterative function to
	// reverse the digits of number
	static int reversNumber(int n) { // 1221 , 122 , 12, 12, 1,0
		int reversed_n = 0; // 1, 12, 122, 1220, 1221

		while (n > 0) { // 1221>0, 122>0, 12>0, 12>0, 1>0
			reversed_n = reversed_n * 10 + n % 10; // 1, 12, 122, 1220, 1221
			// Remove the last digit from n by dividing it by 10 (n = n / 10).
			n = n / 10; // 122, 12, 12, 1, 0
		}
		return reversed_n;
	}

	// Main function
	public static void main(String[] args) {
		int n = 1221;
		int reverseNO = reversNumber(n);
		System.out.println("Reverse of n = " + reverseNO);

//		System.out.println(1 % 10);
//		System.out.println(1 / 10);

		// Checking if n is same
		// as reverse of n
		if (n == reverseNO)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");

	}
}

/*
 * In each iteration of the loop, the last digit of n is extracted using the
 * modulus operator (n % 10) and added to the reversed_n after shifting its
 * digits one place to the left (reversed_n * 10). This effectively reverses the
 * digits.
 */
