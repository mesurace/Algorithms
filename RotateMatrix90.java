package com.algorithms;

public class RotateMatrix90 {

	public static void main(String[] args) {

		int[][] matrix = new int[][] {

				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println("Input Matrix: ");
		print2DMatrix(matrix);
		System.out.println("Result Matrix: ");
		print2DMatrix(rotate(matrix, matrix.length));

	}

	private static void print2DMatrix(int[][] matrix) {

		int row = matrix.length;

		for (int i = 0; i < row; i++) {
			int column = matrix[i].length;
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println("");

		}

	}

	private static int[][] rotate(int[][] matrix, int n) {

		for (int layer = 0; layer < n / 2; layer++) {

			int first = layer;
			int last = n - layer - 1;

			for (int i = first; i < last; i++) {

				int offset = i - first;

				// save top
				int top = matrix[first][i];

				// left-top
				matrix[first][i] = matrix[last - offset][first];

				// bottom- left

				matrix[last - offset][first] = matrix[last][last - offset];

				// right to bottom
				matrix[last][last - offset] = matrix[i][last];

				// top to right

				matrix[i][last] = top;

			}

		}

		return matrix;

	}

}
