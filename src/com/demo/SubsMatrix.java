package com.demo;

import java.util.Scanner;

/*subtraction of two matrices
Write a program to perform subtraction operation on two matrices
*/
public class SubsMatrix {

	public static int[][] substractMatrices(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take input for the first matrix
		System.out.println("Enter elements of the first matrix (3x3):");
		int[][] matrix1 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}

		// Take input for the second matrix
		System.out.println("Enter elements of the second matrix (3x3):");
		int[][] matrix2 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}

		// Perform matrix addition
		int[][] result = substractMatrices(matrix1, matrix2);

		// Display the result
		System.out.println("Resultant matrix after substraction:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}
