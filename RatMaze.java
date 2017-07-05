package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class RatMaze {

	public static void main(String[] args) {

		int maze[][] = { 	{ 1, 0, 0, 0 }, 
							{ 1, 1, 0, 1 }, 
							{ 0, 1, 0, 0 }, 
							{ 1, 1, 1, 1 } };
		
		System.out.println(hasPath(maze, new Position(0, 0), new Position(1, 3)));

	}

	static boolean hasPath(int[][] arr, Position start, Position end) {

		int row = arr.length;
		int column = arr[0].length;

		if (!positionValidation(column, row, start, end))
			return false;

		if (checkEqual(start, end))
			return true;

		Queue<Position> queue = new LinkedList<>();
		queue.add(start);
		
		boolean[][] visited=new boolean[row][column];

		while (!queue.isEmpty()) {

			Position pos = queue.poll();
			System.out.println(pos);
			visited[pos.getX()][pos.getY()]=true;
			
			if (checkEqual(pos, end))
				return true;

			if (pos.getX() < column - 1 && arr[pos.getX() + 1][pos.getY()] == 1&&!visited[pos.getX()+1][pos.getY()]) {
				queue.add(new Position(pos.getX() + 1, pos.getY()));
			}
			
			if (pos.getX() >0 && arr[pos.getX() - 1][pos.getY()] == 1&&!visited[pos.getX()-1][pos.getY()]) {
				queue.add(new Position(pos.getX() - 1, pos.getY()));
			}
			
			if (pos.getY() < row - 1 && arr[pos.getX()][pos.getY() + 1] == 1&&!visited[pos.getX()][pos.getY()+1]) {
				queue.add(new Position(pos.getX(), pos.getY() + 1));
			}
			
			if (pos.getY() >0 && arr[pos.getX()][pos.getY() - 1] == 1&&!visited[pos.getX()][pos.getY()-1]) {
				queue.add(new Position(pos.getX(), pos.getY() - 1));
			}

		}

		return false;
	}

	static boolean positionValidation(int column, int row, Position start, Position end) {
		return start.getX() >= 0 & start.getX() < column && start.getY() >= 0 && start.getY() < row
				&& end.getX() >= 0 & end.getX() < column && end.getY() >= 0 && end.getY() < row;
	}

	static boolean checkEqual(Position start, Position end) {
		return start.getX() == end.getX() && start.getY() == end.getY();
	}

}

class Position {
	int x;
	int y;

	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
