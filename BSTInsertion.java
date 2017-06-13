package com.algorithms;

public class BSTInsertion {

	// binary tree : Insertion algorithm using recursion
	Node Insert(Node root, int value) {

		if (root == null) {
			root = new Node();
			root.left = null;
			root.right = null;
			root.data = value;
		} else {
			if (root.data > value)
				root.left = Insert(root.left, value);
			else
				root.right = Insert(root.right, value);
		}
		return root;
	}

	class Node {
		int data;
		Node left;
		Node right;
	}
}