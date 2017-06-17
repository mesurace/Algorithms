package com.algorithms;

public class StringRunLength {

	public static void main(String[] args) {
		System.out.println(decode(encode("aaaaeddssssdss")));
	}

	static String encode(String src) {

		StringBuilder result = new StringBuilder();
		int count, len = src.length();

		for (int i = 0; i < len; i++) {
			count = 1;
			while (i + 1 < len && src.charAt(i) == src.charAt(i + 1)) {
				count++;
				i++;
			}

			result.append(src.charAt(i));
			result.append(count);

		}

		return result.toString();
	}

	static String decode(String src) {
		StringBuilder result = new StringBuilder();
		int count, len = src.length();
		for (int i = 0; i + 1 < len; i = i + 2) {
			count = src.charAt(i + 1) - '0';
			while (count > 0) {
				result.append(src.charAt(i));
				count--;
			}

		}

		return result.toString();
	}

}
