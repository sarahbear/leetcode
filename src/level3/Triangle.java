package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		int tri[][] = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int i = 0; i < tri.length; i++) {
			ArrayList<Integer> line = new ArrayList<Integer>();
			for (int j = 0; j < tri[i].length; j++)
				line.add(tri[i][j]);
			triangle.add(line);
		}
		System.out.println(new Triangle().minimumTotal(triangle));
	}

	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0)
			return 0;
		int[] dp = new int[triangle.size()];
		dp[0] = triangle.get(0).get(0);
		for (int i = 1, n = triangle.size(); i < n; i++) {
			List<Integer> line = triangle.get(i);
			dp[i] = line.get(i) + dp[i - 1];
			for (int j = i - 1; j > 0; j--) {
				dp[j] = Math.min(dp[j - 1], dp[j]) + line.get(j);
			}
			dp[0] += line.get(0);
		}
		Arrays.sort(dp);
		return dp[0];
	}
}
