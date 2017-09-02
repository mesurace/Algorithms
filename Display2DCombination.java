package com.algorithms;

public class Display2DCombination {
	public static void main(String[] args) {

		String[][] string = { { "quick", "lazy" }, { "brown", "black", "gray" }, { "fox", "dog" } };
		printCombinations(string);

	}

	// method to print all the combinations of words from 2D array which have
	// different number of elements in its sub arrays.
	public static void printCombinations(String[][] words) {

		int sizeArray[] = new int[words.length];
		int counterArray[] = new int[words.length];

		int totalCombinationCount = 1;
		for (int i = 0; i < words.length; ++i) {
			sizeArray[i] = words[i].length;
			totalCombinationCount *= words[i].length;
		}

		for (int countdown = totalCombinationCount; countdown > 0; --countdown) {
			for (int i = 0; i < words.length; ++i) {

				System.out.print(words[i][counterArray[i]] + " ");

			}
			System.out.println();
			for (int incIndex = words.length - 1; incIndex >= 0; --incIndex) {
				if (counterArray[incIndex] + 1 < sizeArray[incIndex]) {
					++counterArray[incIndex];
					break;
				}
				counterArray[incIndex] = 0;
			}
		}
	}

}