package com.demo;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		int reverse = 0;
		while (n != 0) {
			int d = n % 10;
			reverse = reverse * 10 + d;
			n = n / 10;
		}
		System.out.println("Reverse No : " + reverse);
		scanner.close();

		// Logic with predefined method
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the No : ");
//		String str = obj.nextLine();
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb.reverse());
//		obj.close();
	}

}
