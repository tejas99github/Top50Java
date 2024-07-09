package com.demo;

import java.util.Scanner;

/*the factorial of a number is calculated by formula number*(number -1) till zero and since the value of factorial zero
  is 1, it acts as a base case in the recursive version of the factorial method. */
public class Factorial_Recursive {

	private static int factorial(int i) {
		if (i == 0 || i == 1) {
			return 1;
		}
		return i * factorial(i - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no>> ");
		int i = sc.nextInt();
		System.out.println(factorial(i));
		sc.close();
	}

}
// 5!=5*4*3*2*1 
//   =5*4!
// n!=n*(n-1)!
// 5!=5*(5-1)!