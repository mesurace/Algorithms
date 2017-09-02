package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatedNumber {

	public static void main(String[] args) {
		System.out.println(maximumRepeated(new int[] { -1, 2, 6, 2, 1, 4, 0, -1, -1, 2, 9 }));

	}

	// method to return maximum repeated Integer from array
	private static int maximumRepeated(int[] numbers) {

		if (numbers.length == 0)
			throw new IllegalArgumentException();

		int len = numbers.length;

		// HashMap where key is number itself and value is dubplicate number of
		// that number
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			int temp = numbers[i];
			int count = 1;
			if (map.containsKey(temp))
				count += map.get(temp);
			map.put(temp, count);

		}

		int max = Integer.MIN_VALUE;
		int result = numbers[0];

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int tempValue = entry.getValue();
			if (tempValue > max) {
				max = tempValue;
				result = entry.getKey();
			}

		}

		return result;
	}

}
