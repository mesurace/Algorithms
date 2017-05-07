package com.algorithms;

/**
 * @author suresh adhikari
 *
 */
public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println(factorial(5));

		System.out.println(factorialRecursion(5));

	}

	public static int factorial(int n) {
		int result = 1;
		while (n > 1) {
			result = result * n;
			n--;
		}
		return result;
	}

	/**
	 * recursion method to calculate factorial of a number 
	 */
	public static int factorialRecursion(int n) {
		if (n==0)
			return 1;
		else
			return n * factorialRecursion(n - 1);
	}

}
