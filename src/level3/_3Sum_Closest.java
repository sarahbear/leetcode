package level3;

import java.util.Arrays;

public class _3Sum_Closest {

	public static void main(String[] args) {
	}

	public static int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
		int closest = Integer.MAX_VALUE;
		int minDis = Integer.MAX_VALUE;
		for (int i = 0; i < num.length - 2; i++) {
			int j = i + 1;
			int k = num.length - 1;
			while (j < k) {
				int sum = num[i] + num[j] + num[k];
				if (Math.abs(sum - target) < minDis) {
					minDis = Math.abs(sum - target);
					closest = sum;
				}
				if (sum > target)
					k--;
				else if (sum < target)
					j++;
				else
					return target;
			}
		}
		return closest;
	}
}
