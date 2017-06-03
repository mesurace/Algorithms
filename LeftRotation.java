package com.algorithms;

import java.util.Scanner;

/**
 * @author Suresh Adhikari
 *
 */
public class LeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] inputArray = new int[n];
		for (int i = 0; i < n; i++) {

			inputArray[(i + n - d) % n] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}

}
