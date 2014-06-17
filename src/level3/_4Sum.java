package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4Sum {

	public static void main(String[] args) {
		int[] num = { -1, 0, 1, 2, -1, -4 };
		int target = -1;
		System.out.println(fourSum(num, target));
	}

	public static List<List<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int len = num.length;
		if (len < 4)
			return ans;
		for (int i = 0; i < len; i++) {
			if (i != 0 && num[i] == num[i - 1])
				continue;
			for (int j = len - 1; j > i; j--) {
				if (j != len - 1 && num[j] == num[j + 1])
					continue;
				int L = i + 1;
				int R = j - 1;
				while (L < R) {
					int sum = num[i] + num[L] + num[R] + num[j];
					if (L != i + 1 && num[L] == num[L - 1]) {
						L++;
					} else if (R != j - 1 && num[R] == num[R + 1]) {
						R--;
					} else if (sum < target) {
						L++;
					} else if (sum > target) {
						R--;
					} else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(num[i]);
						list.add(num[L]);
						list.add(num[R]);
						list.add(num[j]);
						ans.add(list);
						L++;
						R--;
					}
				}
			}
		}
		return ans;
	}
}
