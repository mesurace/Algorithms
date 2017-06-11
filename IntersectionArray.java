package com.algorithms;

import java.util.Arrays;

public class IntersectionArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(inetersectionArray(new int[] { 0, 1, 4, 5, 9 }, new int[] { 0, 5, 10 })));

	}

	static int[] inetersectionArray(int[] a, int[] b) {

		int i = 0;
		int j = 0;
		int k = 0;

		int[] result;

		if (a.length < b.length)
			result = new int[a.length];
		else
			result = new int[b.length];

		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				i++;
			else if (b[j] < a[i])
				j++;
			else if (a[i] == b[j]) {
				result[k] = a[i];
				i++;
				j++;
				k++;
			}

		}

		return result;
	}

}
