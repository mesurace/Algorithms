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

		//if 100<n<10^9 is greater
		System.out.println(nTHSum(1000000000));

		//if n<100
		System.out.println(findNthNumber(6));
	}

	
	/**
	 * @param int n
	 * @return nth number which is sum of previous three
	 * iterative way
	 */
	public static int nTHSum(int n){

        if(n == 1|| n==2 ||n==3)
            return n;


        int prev = 3;
        int nextP = 2;
        int nextNextP =1;
        int sum = (prev+nextP+nextNextP) ;
        for(int i=4;i<=n;i++){
            sum =(prev+nextP+nextNextP);
            nextNextP = nextP;
            nextP = prev;
            prev = sum;
        }

        return sum;
    }
	
	/**
	 * @param int n
	 * @return nth number which is sum of previous three
	 * using recursion
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
