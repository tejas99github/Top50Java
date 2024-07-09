package com.demo;

/*Write a function, which takes a String word and returns sentence on which words are reversed in order like 
if the input is "Java is best programming language", the output should be "language programming best is Java".*/

// Write a progm in java to reverse words in a String sentence .

public class Reverse_WordIn_Sentence {
	public static void main(String[] args) {
		String sentence = "Hello World!";
		String reversedSentence = reverseWords(sentence);
		System.out.println(reversedSentence);
	}

	public static String reverseWords(String sentence) {
		char[] characters = sentence.toCharArray();
		reverse(characters, 0, characters.length - 1); // Reverse the entire sentence

		int start = 0;
		for (int end = 0; end < characters.length; end++) {
			if (characters[end] == ' ') {
				reverse(characters, start, end - 1); // Reverse each word
				start = end + 1;
			}
		}
		reverse(characters, start, characters.length - 1); // Reverse the last word

		return new String(characters);
	}

	public static void reverse(char[] array, int start, int end) {
		while (start < end) {
			char temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}

/*
 * This program takes a sentence as input, splits it into words, reverses each
 * word, and then reverses the entire sentence again to get the final output.
 */