package com.algorithms;

public class LowestCommonAncestorBST {

	public static void main(String[] args) {
		// make BST and test  :D
	}

	static Node lCA(Node node, int num1, int num2) {

		if (node == null)
			return node;

		if (node.data > num1 && node.data > num2) {
			lCA(node.left, num1, num2);
		}

		if (node.data < num1 && node.data < num2) {
			lCA(node.right, num1, num2);
		}

		return node;
	}

	class Node {
		int data;
		Node left;
		Node right;
	}

}
