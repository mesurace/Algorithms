import java.util.ArrayList;

/**
 * @author suresh adhikari
 *
 */
public class ZeroCount {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1 };

		System.out.println(CountOfZeroes(a, 0));

		System.out.println("Number of zeros: " + count(a, 0, a.length));
		System.out.println("Number of ones: " + (a.length - count(a, 0, a.length)));
		ArrayList<Integer> list=new ArrayList<>();

	}

	public static int zeroCount(int[] a) {

		if (a[0] == 1)
			return 0;
		int length = a.length;
		if (a[length - 1] == 0)
			return length;

		return count(a, 0, length);
	}

	public static int count(int[] a, int lower, int upper) {
		int mid = (lower + upper) / 2;
		if (a[mid] != a[mid - 1])
			return mid;

		if (a[mid] != a[mid + 1])
			return mid + 1;

		if (a[mid] == 1) {
			return count(a, lower, mid - 1);
		} else if (a[mid] == 0) {
			return count(a, mid + 1, upper);
		}
		return 0;
	}

	static int CountOfZeroes(int[] A, int key) {
		int low = 0;
		int high = A.length - 1;
		int result = -1;

		while (low <= high) {

			System.out.println("Solution");
			int mid = low + (high - low) / 2;

			if (A[mid] == key) {
				result = mid;
				low = mid + 1;
			} else if (key < A[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return result + 1;
	}

}
