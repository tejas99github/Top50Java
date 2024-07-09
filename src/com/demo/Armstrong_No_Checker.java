package com.demo;

//Java program to determine whether the number is Armstrong number or not

/*A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27,
  which is equal to 1^3+5^3+3^3.*/

public class Armstrong_No_Checker{
	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int p = 0;

		// Function to calculate the sum of
		// individual digits
		while (n > 0) { // 153>0, 15>0, 1>0
			int rem = n % 10; // 3, 5, 1
			p = (p) + (rem * rem * rem); // 27, 152, 153
			n = n / 10; // 15, 1 ,
		}

		// Condition to check whether the value
		// of P equals to user input or not.
		if (temp == p) {
			System.out.println("Yes. It is Armstrong No.");
		} else {
			System.out.println("No. It is not an Armstrong No.");
		}
	}
}
