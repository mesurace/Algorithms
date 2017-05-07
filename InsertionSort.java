package com.algorithms;

import java.util.Arrays;

/**
 * @author suresh adhikari
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(insertionSort(new int[] { 23, 5, 4, 9, 13, 0, 18 })));

	}

	public static int[] insertionSort(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		return array;
	}

}
