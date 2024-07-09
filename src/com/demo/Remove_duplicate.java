package com.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Java Program to remove repeated elements from ArrayList in Java.

public class Remove_duplicate {

	public static void main(String[] args) {

// creating ArrayList with duplicate elements

		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(7);

		// printing arraylist with duplicates
		System.out.println("Arraylist with duplicates" + primes);

		/*
		 * Now let's remove duplicate element without affecting order LinkedHashSet will
		 * guaranteed the order and since it's set it will not allow us to insert
		 * duplicates. repeated elements will automatically filtered.
		 */

		Set<Integer> primeswithoutduplicate = new LinkedHashSet<Integer>(primes);

		// now let's clear the ArrayList so that we can copy all elements from
		// LinkedHashSet.
		primes.clear();

		// copying elements but without any duplicates
		primes.addAll(primeswithoutduplicate);

		// printing arraylist without arraylist
		System.out.println("Arraylist without duplicates" + primes);

	}

}
