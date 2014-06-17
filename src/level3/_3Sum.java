package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

	public static void main(String[] args) {
		int[] num = { -1, 0, -1, 1, 2, 5, 4 };
		System.out.println(threeSum(num));
	}

	public static List<List<Integer>> threeSum(int[] num) {// List<? extends List<Integer>>
		List<List<Integer>> ans = new ArrayList<List<Integer>>();//List<ArrayList<Integer>> ans =...
		Arrays.sort(num);
		int len = num.length;
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;
			for (int j = i + 1; j < len - 1; j++) {
				if (j > i + 1 && num[j] == num[j - 1])
					continue;
				for (int k = j + 1; k < len; k++) {
					if (k > j + 1 && num[k] == num[k - 1])
						continue;
					int sum = num[i] + num[j] + num[k];
					if (sum == 0) {
						ArrayList<Integer> t = new ArrayList<Integer>();
						t.add(num[i]);
						t.add(num[j]);
						t.add(num[k]);
						ans.add(new ArrayList<Integer>(t));
					}
				}
			}
		}
		return ans;
	}

	public static ArrayList<ArrayList<Integer>> threeSum2(int[] num) {
		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sum3 = new ArrayList<Integer>();
		for (int i = 0; i < num.length - 2; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;
			for (int j = i + 1; j < num.length - 1; j++) {
				if (j > i + 1 && num[j] == num[j - 1])
					continue;
				for (int k = j + 1; k < num.length; k++) {
					if (k > j + 1 && num[k] == num[k - 1])
						continue;
					int sum = num[i] + num[j] + num[k];
					if (sum == 0) {
						sum3.add(num[i]);
						sum3.add(num[j]);
						sum3.add(num[k]);
						ans.add(new ArrayList<Integer>(sum3));
						sum3.clear();
					}
				}
			}
		}
		return ans;
	}
}
