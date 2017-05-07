package com.algorithms;

import java.util.Arrays;

/**
 * @author suresh adhikari
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(selectionSort(new int[] { 23, 5, 4, 9, 13, 0, 18 })));

	}

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int smallerNumber = array[index];
			array[index] = array[i];
			array[i] = smallerNumber;
		}
		return array;
	}
}
