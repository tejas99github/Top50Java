package com.demo;

public class Int_Permutation {
	public static void main(String args[]) {
		permutation("123");
	}

	/* * A method exposed to client to calculate permutation of String in Java. */
	public static void permutation(String input) {
		permutation("", input);
	}

	/*
	 * * Recursive method which actually prints all permutations * of given String,
	 * but since we are passing an empty String * as current permutation to start
	 * with, * I have made this method private and didn't exposed it to client.
	 */
	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) { 
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}
}

/*Suppose we have the input string "abc".

Initially, the permutation method is called with an empty string for perm and the input string "abc" for word.

Inside the method, it checks if word is empty. Since it's not, it proceeds to the else block.

It iterates over each character of word:

For i = 0: It appends the character at index 0 of word to perm, resulting in "a", and then calls permutation recursively with "a" as the new perm and "bc" as the new word.

For i = 1: It appends the character at index 1 of word to perm, resulting in "b", and then calls permutation recursively with "b" as the new perm and "ac" as the new word.

For i = 2: It appends the character at index 2 of word to perm, resulting in "c", and then calls permutation recursively with "c" as the new perm and "ab" as the new word.

The process continues recursively until word becomes empty:

For the call with perm = "a", word = "bc":

word is not empty, so it iterates over each character of "bc" and recursively calls permutation.
This generates "ab" and "ac".
For the call with perm = "b", word = "ac":

This generates "ba" and "bc".
For the call with perm = "c", word = "ab":

This generates "ca" and "cb".
When word becomes empty, it prints the permutation:

For the call with perm = "" and word = "", it prints "abc".
For other recursive calls, it prints various permutations as they accumulate in the perm parameter.
The output will be all possible permutations of the input string "abc": abc, acb, bac, bca, cab, and cba.*/