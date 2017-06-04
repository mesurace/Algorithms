/**
 * Given a  2D Array, A:
 * 1 1 1 0 0 0
   0 1 0 0 0 0
   1 1 1 0 0 0
   0 0 0 0 0 0
   0 0 0 0 0 0
   0 0 0 0 0 0
 
  and an hourglass in A:
    
    a b c
  	  d
	e f g
	
	This algorithm calculate the hourglass sum for every hourglass in A, 
	then print the maximum hourglass sum.
 */
package com.algorithms;

/**
 * @author Suresh Adhikari
 *
 */
public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int temp;

		// sample input
		int[][] values = new int[][] { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 2, 4, 4, 0 }, { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				temp = values[i][j] + values[i][j + 1] + values[i][j + 2] + values[i + 1][j + 1] + values[i + 2][j]
						+ values[i + 2][j + 1] + values[i + 2][j + 2];
				max = Math.max(temp, max);
			}
		}
		System.out.print(max);

	}

}
