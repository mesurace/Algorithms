package com.algorithms;

import java.util.Arrays;

/**
 * @author suresh adhikari
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(bubbleSort(new int[] { 23, 5, 4, 9, 13, 0, 18 })));

	}

	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}
		}
		return array;

	}

}
