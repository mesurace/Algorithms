package com.algorithms;

public class MaxScoreOfVincent {

	public static void main(String[] args) {
		System.out.println(maxScoreOfVincent(100,
				"AAACCCCCCCBAAAAAADD...DDDDDDDDDDDDEEEEEEEEEEEBBBBBBBAAAAAAAAAABBBBBBBBBBBBBBBBBAAAAAAAAAABEE..ADDED.",
				"AAACCCCCCCBAAAA...DDDDDDDDDDDDDDDDEEEEEEEEEEEBBBBBBBAAAAAAAAAABBBBBBBBBBBBBBBBBAAAAAAAAAABEE..ADDED."));

	}

	static int maxScoreOfVincent(int n, String s, String t) {

		int i = 0;
		int result = 0;
		while (i < n) {

			if (s.charAt(i) != '.' && s.charAt(i) != t.charAt(i))
				result++;
			i++;
		}
		return result;

	}

}
