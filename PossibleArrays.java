import java.util.Stack;

public class PossibleArrays {
	public static void main(String[] args) {

		int[] A = { 10, 15, 25 };
		int[] B = { 1, 5, 20, 30 };

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < A.length; i++) {
			st.push(A[i]);
			generateArrays(A, B, i, 0, st, false);
			st.clear();
		}
	}

	static void generateArrays(int ar1[], int ar2[], int index_of_a, int index_of_b, Stack<Integer> st, boolean first) {
		if (index_of_a >= ar1.length || index_of_b >= ar2.length) {
			st.pop();
			return;
		}

		// take from second if available
		if (!first) {
			for (int j = index_of_b; j < ar2.length; j++) {
				if (ar1[index_of_a] < ar2[j]) {
					st.push(ar2[j]);
					System.out.println(st);
					generateArrays(ar1, ar2, index_of_a + 1, j, st, true);
				}
			}
		}

		// take from first if available
		else if (first) {
			for (int i = index_of_a; i < ar1.length; i++) {
				if (ar1[i] > ar2[index_of_b]) {
					st.push(ar1[i]);
					generateArrays(ar1, ar2, i, index_of_b + 1, st, false);
				}
			}
		}

		st.pop();
	}
}