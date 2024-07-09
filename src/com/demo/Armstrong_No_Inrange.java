package com.demo;

//Java program to find all Armstrong numbers in a given range

public class Armstrong_No_Inrange {
	public static void isArmstrong(int left, int right) {
		for (int i = left; i <= right; i++) {
			int sum = 0;
			int temp = i;
			while (temp > 0) {
				// Finding the last digit
				int lastdigit = temp % 10;

				// Finding the sum
				sum += Math.pow(lastdigit, 3);
				temp /= 10;
			}

			// Condition to print the number if it
			// is an Armstrong number
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// Driver code
	public static void main(String[] args) {
		int left = 5, right = 1000;
		isArmstrong(left, right);
	}
}

/*
 * The isArmstrong function takes two integer parameters: left and right, which
 * represent the range of numbers to check for Armstrong numbers.
 * 
 * Inside the isArmstrong function, there is a for loop that iterates through
 * all the numbers from left to right.
 * 
 * For each number i in this range, the program initializes a variable sum to 0
 * and a temporary variable temp to the current number i.
 * 
 * Then, it enters a while loop that runs as long as temp is greater than 0. In
 * each iteration of the loop, it extracts the last digit of temp using the
 * modulo operator (%) and stores it in lastdigit. It calculates the sum of the
 * cubes of these digits and adds it to the sum variable. It then removes the
 * last digit from temp by dividing it by 10.
 * 
 * After the while loop finishes, the program checks if sum is equal to the
 * original number i. If they are equal, it means i is an Armstrong number, and
 * it prints i to the console.
 * 
 * Finally, the main function sets the range by specifying values for left (5)
 * and right (1000) and calls the isArmstrong function to find and print
 * Armstrong numbers in that range.
 */