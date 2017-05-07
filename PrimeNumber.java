package com.algorithms;

/**
 * @author suresh adhikari
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(-1));
		System.out.println(isPrime(0));
		System.out.println(isPrime(2));
		System.out.println(isPrime(29));

		System.out.println(isPrimeRecursion(-1));
		System.out.println(isPrimeRecursion(0));
		System.out.println(isPrimeRecursion(2));
		System.out.println(isPrimeRecursion(29));
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

	private static boolean isPrimeRecursion(int num) {

		if (num == 2)
			return true;
		if (num % 2 == 0 || num < 2)
			return false;
		else {
			return isPrimeHelper(3, num);
		}
	}

	private static boolean isPrimeHelper(int i, int num) {
		if (num % i == 0)
			return false;
		else if (i * i > num)
			return true;
		else
			return isPrimeHelper(i + 2, num);
	}

}
