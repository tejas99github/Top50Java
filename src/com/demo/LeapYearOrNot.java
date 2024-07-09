package com.demo;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void isLeapYear(int year) {

		boolean is_Leap_Year = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;

		if (is_Leap_Year) {

			System.out.println(year + " : Leap Year");
			
		} else {

			System.out.println(year + " : Non Leap Year");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the Year to check is Leap year or Not");

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();

		isLeapYear(year);

		scan.close();
	}

}
