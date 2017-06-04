/**
 * This is a binary tree traversal algorithms. 
 * There are three ways pre, post and in order traversal.
 */
package com.algorithms;

/**
 * @author Suresh Adhikari
 *
 */
public class TreeTraversal {

	void preOrder(Node root) {
		if (root == null)
			return;

		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root) {
		if (root == null)
			return;
		preOrder(root.left);
		System.out.println(root.data + " ");
		preOrder(root.right);
	}

	void postOrder(Node root) {
		if (root == null)
			return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data + " ");
	}

}

class Node {
	int data;
	Node left;
	Node right;

	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
