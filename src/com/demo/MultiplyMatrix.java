package com.demo;

import java.util.Scanner;

/*multiplication of two matrices
Write a program to perform multiplication operation on two matrices
*/
public class MultiplyMatrix {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int i, j, k;

		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];

		System.out.println("Enter the elements of 1st matrices");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println("Enter the elements of 2nd matrices");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = obj.nextInt();
			}
		}

		// Multiplication logic
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (k = 0; k < 3; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}

		System.out.println("Result Matrix : ");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		obj.close();
	}

}
