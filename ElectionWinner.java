package blackrock.solutions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh adhikari
 *
 */
public class ElectionWinner {
	public static void main(String[] args) throws IOException {

		String[] votes = new String[] { "Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex",
				"Mary", "Mary" };
		System.out.println(electionWinner(votes));

	}

	static String electionWinner(String[] votes) {

		Map<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < votes.length; i++) {

			String temp = votes[i];
			if (!hashMap.containsKey(temp)) {
				hashMap.put(temp, 0);
			} else {
				hashMap.put(temp, hashMap.get(temp) + 1);
			}
		}

		String maxName = "";
		int max = Integer.MIN_VALUE;
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			int count = entry.getValue();
			if (count > max) {
				max = count;
				maxName = entry.getKey();
			} else if (count == max) {
				if (maxName.compareTo(entry.getKey()) < 0) {
					maxName = entry.getKey();
				}
			}

		}

		return maxName;

	}

}
