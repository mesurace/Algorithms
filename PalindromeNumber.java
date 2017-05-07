package com.algorithms;

/**
 * @author sureshadhikari
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(1234321));
	}

	public static boolean isPalindrome(int n) {

		int temp = n;
		int reverseNumber = 0;

		while (temp > 0) {

			reverseNumber = reverseNumber * 10 + temp % 10;
			temp = temp / 10;

		}

		if (n == reverseNumber)
			return true;

		return false;

	}

}
