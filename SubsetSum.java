package MergeAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetSum {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3 };
		String[] arr2 = { "A", "B", "C" };
		List set = new ArrayList<>();
		set.addAll(Arrays.asList(arr2));
		System.out.println(powerSet(set));
		System.out.println(recursive("ABC"));
	}

	public static <T> List<Set<T>> powerSet(List<T> set) {
		List<Set<T>> powerList = new ArrayList<>();
		Set<T> newSet = new HashSet<>();
		powerList.add(newSet);
		Set<T> temp = new HashSet<>();

		T f;
		while (!set.isEmpty()) {

			f = set.remove(0);

			int length = powerList.size();
			for (int i = 0; i < length; i++) {
				temp = new HashSet<T>(powerList.get(i));
				temp.add(f);
				powerList.add(temp);

			}

		}

		return powerList;
	}
	
	
	static List<List<String>> recursive(String str) {
	    List<List<String>> result = new ArrayList<>();

	    if (str.length() == 1) {
	        result.add(new ArrayList<>());
	        result.get(0).add(str);
	        return result;
	    }

	    for (List<String> list : recursive(str.substring(1))) {
	        List<String> append = new ArrayList<>(list);
	        append.set(0, str.substring(0, 1) + append.get(0));
	        List<String> add = new ArrayList<>(list);
	        add.add(0, str.substring(0, 1));
	        result.add(append);
	        result.add(add);
	    }
	    return result;
	}
	
	
	

}
