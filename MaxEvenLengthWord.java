package com.algorithms;

public class MaxEvenLengthWord {

	public static void main(String[] args) {
		// expected answer is "from"
		System.out.println(maxEvenLengthWord("Hi where are you from"));

	}

	// method to return the first maximum even length word from the sentence
	// if there is no it will return "00"
	// sentence only contains English alphabets and separated by space
	private static String maxEvenLengthWord(String sentance) {

		if (sentance == null || sentance.length() == 0)
			return sentance;

		String[] words = sentance.split(" ");
		int len = words.length;
		String result = "00";
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < len; i++) {

			int temp = words[i].length(); // length of current word
			if (temp % 2 == 0) {

				if (temp > max) {
					max = temp;
					result = words[i];
				}

			}

		}

		return result;
	}

}
