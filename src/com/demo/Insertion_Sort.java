package com.demo;

public class Insertion_Sort {

	static void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");

		}
	}

	public static void main(String[] args) {

		int arr[] = { 7, 8, 3, 1, 2 };

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}

		printArray(arr);
	}

}
