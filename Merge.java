package MergeAlgorithm;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {

		int[] arr1 = { 2,3,6 };
		int[] arr2 = { 1,2,3,4 };
		System.out.println(Arrays.toString(merge(arr1, arr2)));
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] result = new int[length];
		int i = 0;
		int j = 0;
		int newIndex = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[newIndex] = arr1[i];
				i++;
				newIndex++;
			} else {
				result[newIndex] = arr2[j];
				j++;
				newIndex++;
			}
		}
		if (i == arr1.length) {
			for (int k = j; k < arr2.length; k++) {
				result[newIndex] = arr2[k];
				newIndex++;
			}
		} else {
			for (int k = i; k < arr1.length; k++) {
				result[newIndex] = arr1[k];
				newIndex++;
			}
		}

		return result;

	}

}
