package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTreeTraversal {

	/*
	 * class Node 
	 * int data; 
	 * Node left; 
	 * Node right;
	 */
	void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}

	}

}
