package level3;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(candidates);
		search(ans, candidates, target, 0, new ArrayList<Integer>());
		return ans;
	}

	private static void search(ArrayList<ArrayList<Integer>> ans, int[] candidates, int target, int index,
			ArrayList<Integer> a) {
		if (target == 0) {
			ans.add(new ArrayList<Integer>(a));
			return;
		}
		if (index == candidates.length || candidates[index] > target)
			return;
		for (int times = 0; times <= target / candidates[index]; times++) {
			search(ans, candidates, target - times * candidates[index], index + 1, a);
			a.add(candidates[index]);
		}
		for (int times = 0; times <= target / candidates[index]; times++)
			a.remove(a.size() - 1);
	}
}
