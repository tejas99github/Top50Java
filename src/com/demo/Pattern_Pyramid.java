package com.demo;

public class Pattern_Pyramid {
	int i, j, k;

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// pyramid of number

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < 5 - i; k++) {

				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {

				System.out.print(j + " ");

			}

			System.out.println();
		}

	}

}
