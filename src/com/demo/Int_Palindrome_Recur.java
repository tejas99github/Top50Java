package com.demo;

//Java program to reverse a number and find if it is a palindrome or not using Recursion

// Driver Class
public class Int_Palindrome_Recur {

	// Recursive function to reverse
	// the digits of number
	static int recursive_func(int n, int rev) {// (123464321,0)(12346432,1)(1234643,12)(123464,123)(12346,1234)(1234,12346)(123,123464)(12,1234643)(1,12346432)

		if (n < 10) {
			return rev * 10 + n; // 123464321
		} else {
			int last_digit = n % 10; // 1,2,3,4,6,4,3,2,
			rev = rev * 10 + last_digit; // 1,12,123,1234,12346,123464,1234643,12346432
			return recursive_func(n / 10, rev);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int n = 123464321;
		int rev = recursive_func(n, 0);

//		System.out.println(12 % 10);
//		System.out.println(12 / 10);

		System.out.println("Reverse of n = " + rev);

		// Checking if n is same as reverse of n
		if (n == rev)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");

	}

}

/*
 * Inside the recursive_func method, there is a recursive logic. It checks if
 * the given number n is less than 10. If n is less than 10, it means it's a
 * single-digit number, so the method returns rev * 10 + n, effectively
 * appending the last digit of n to the rev variable.
 * 
 * If n is not less than 10, the program calculates the last digit of n by
 * taking the remainder when dividing by 10 and stores it in the variable
 * last_digit. Then, it appends this last digit to the rev variable and makes a
 * recursive call to recursive_func with the remaining part of the number
 * obtained by dividing n by 10.
 */