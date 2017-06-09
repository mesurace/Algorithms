package com.algorithms;

public class WordsCount {

	public static void main(String[] args) {
		System.out.println("Number of words in the string is : " + wordsCount("   word count"));
	}

	static int wordsCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((i > 0 && (ch != ' ') && s.charAt(i - 1) == ' ') || (i == 0 && ch != ' ')) {
				count++;
			}

		}

		return count;
	}

}
