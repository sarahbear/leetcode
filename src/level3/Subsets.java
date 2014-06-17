package level3;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> ans = subsets(new int[] { 4,1,0});
		System.out.println(ans);
	}

	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(S);
		for (int i = 0; i <= S.length; i++) {
			createList(ans, S, new ArrayList<Integer>(), i, 0);
		}
		return ans;
	}

	private static void createList(ArrayList<ArrayList<Integer>> ans, int[] s,
			ArrayList<Integer> a, int len, int start) {
		if (a.size() == len) {
			ans.add(new ArrayList<Integer>(a));
			return;
		}
		for (int i = start; i < s.length; i++) {
			a.add(s[i]);
			createList(ans, s, a, len, i + 1);
			a.remove(a.size() - 1);
		}
	}
}
