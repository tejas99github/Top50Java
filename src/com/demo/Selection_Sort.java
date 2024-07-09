package com.demo;

public class Selection_Sort {

	static void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 7, 8, 3, 1, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}

		printArray(arr);

	}

}
