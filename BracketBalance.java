package com.algorithms;

import java.util.Stack;

public class BracketBalance {

	public static void main(String[] args) {
		try {
			System.out.println(bracketBalance("2+[9-{(2*2)}]"));
		} catch (Exception e) {
			System.out.println("I am here");
		}

	}

	private static boolean bracketBalance(String exp) {

		if (exp == null)
			return false;

		Stack<Character> stack = new Stack<>();
		int i = 0;
		while (i < exp.length()) {

			char ch = exp.charAt(i);

			if (ch == '[')
				stack.add(']');
			else if (ch == '{')
				stack.add('}');
			else if (ch == '(')
				stack.add(')');

			else if (ch == ']' || ch == '}' || ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}

				char temp = stack.pop();
				if (temp != ch) {
					return false;
				}

			}

			i++;
		}
		return stack.isEmpty();
	}

}
