package com.algorithms;

public class SecondSmallestElement {

	public static void main(String[] args) {
		try {
			System.out.println(secondSmallest(new int[] { 9, 4, 1, 8, 21, 13, 19 }));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	static int secondSmallest(int[] a) throws Exception {

		if (a.length < 2)
			throw new Exception();

		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (small > a[i]) {
				secondSmall = small;
				small = a[i];
			} else if (secondSmall > a[i]) {
				secondSmall = a[i];
			}

		}

		return secondSmall;
	}
}
