package level3;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {
		System.out.println(combine(2, 1));
	}

	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		combine(n, k, ans, new ArrayList<Integer>(), 0);
		return ans;
	}

	private static void combine(int n, int k, ArrayList<ArrayList<Integer>> ans,
			ArrayList<Integer> each, int start) {
		if (each.size() == k) {
			ans.add(new ArrayList<Integer>(each));
			return;
		}
		for (int i = start; i < n; i++) {
			each.add(i + 1);
			combine(n, k, ans, each, i + 1);
			each.remove(each.size() - 1);
		}
	}
}
