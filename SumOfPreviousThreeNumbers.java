/**
 * First three numbers are 1,2 and 3 and from the fourth number, it will be sum of previous 
 * three numbers onward. This algorithm finds the Nth number.
 */
package com.algorithms;

/**
 * @author Suresh Adhikari
 *
 */
public class SumOfPreviousThreeNumbers {

	public static void main(String[] args) {

		System.out.println(findNthNumber(6));
	}

	
	/**
	 * @param int n
	 * @return nth number which is sum of previous three
	 */
	public static int findNthNumber(int n) {
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		if (n < 1) {
			return 0;
		} else if (n < 4) {
			return array[n - 1];
		} else
			return findNthNumberImp(array, n);

	}

	/**
	 * @param int[] array, int n
	 * @return nth number which is sum of previous three
	 */
	private static int findNthNumberImp(int[] array, int n) {

		if (n == 3) {
			return array[2];
		}

		else {
			int temp = array[2];
			array[2] = array[0] + array[1] + temp;

			array[0] = array[1];
			array[1] = temp;

			return findNthNumberImp(array, n - 1);

		}

	}

}
