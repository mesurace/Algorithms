package com.algorithms;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibo(5);
		System.out.println(Arrays.toString(fibo1(10)));
	}

	public static void fibo(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	public static int[] fibo1(int n) {
		int[] result = new int[n];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i < n; i++) {
			result[i] = result[i - 1] + result[i - 2];

		}

		return result;
	}

}
