package com.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Given a List of N number a1,a2,a3........an, 
 * You have to find smallest number from the List that is repeated in the 
 * List exactly K number of times.
*/
public class RepeatedKTimes {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int[] number = new int[N];

		for (int i = 0; i < N; i++) {
			number[i] = s.nextInt();
		}

		int k = s.nextInt();

		System.out.println(repeatedKTimes(number, k));
	}

	private static int repeatedKTimes(int[] number, int k) {
		int len = number.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < len; i++) {
			int count = 1;
			int currentKey = number[i];
			if (hashMap.containsKey(currentKey)) {
				count = count + hashMap.get(currentKey);
			}
			hashMap.put(currentKey, count);
		}

		int min = Integer.MAX_VALUE;
		int result = number[0];
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			int tempValue = entry.getValue();
			int tempKey = entry.getKey();
			if (tempValue == k) {
				if (tempKey < min) {
					min = tempKey;
					result = tempKey;
				}
			}

		}

		return result;
	}

}
