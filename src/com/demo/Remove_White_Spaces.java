package com.demo;

class Remove_White_Spaces {

	public static void main(String[] args) {
		String input = "  Hello   World  ";
		String result = removeWhiteSpaces(input);
		System.out.println("Original String: \"" + input + "\"");
		System.out.println("String with white spaces removed: \"" + result + "\"");
	}

	public static String removeWhiteSpaces(String input) {
		char[] chars = input.toCharArray();
		int newIndex = 0;
		char[] output = new char[chars.length];

		for (char c : chars) {
			if (!Character.isWhitespace(c)) {
				output[newIndex++] = c;
			}
		}

		return new String(output, 0, newIndex);
	}
}
