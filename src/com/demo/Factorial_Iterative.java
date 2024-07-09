package com.demo;

import java.util.Scanner;

public class Factorial_Iterative {

	public static int fact(int no) {
		int res = 1;
		for (int i = 1; i <= no; i++) {
			res = res * i;
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number >> ");
		int no = scanner.nextInt();
		System.out.println(fact(no));
		scanner.close();
	}

}
