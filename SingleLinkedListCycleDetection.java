package com.algorithms;

public class SingleLinkedListCycleDetection {

	public static void main(String[] args) {

		Node1 n1 = new Node1(null, 9);

		Node1 n2 = new Node1(n1, 9);

		Node1 n3 = new Node1(n2, 3);

		Node1 n4 = new Node1(n3, 0);

		Node1 root = new Node1(n4, 0);

		System.out.println(isCycle(root)); //expected false
		
		n1.setNext(root);

		System.out.println(isCycle(root)); // expected true

	}

	static boolean isCycle(Node1 root) {

		if (root == null)
			return false;

		Node1 slowRunner = root;
		Node1 fastRunner = root;

		while (slowRunner.next != null && fastRunner.next != null && fastRunner.next.next != null) {

			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;

			if (slowRunner == fastRunner)
				return true;

		}
		return false;

	}
}

class Node1 {

	Node1 next;
	int data;

	Node1(Node1 nxt, int data) {
		this.next = nxt;
		this.data = data;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
