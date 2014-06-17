package level3;

public class Unique_Binary_Search_Trees {

	public static void main(String[] args) {

	}

	public int numTrees(int n) {
		if (n < 0)
			return 0;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i - j - 1];
			}
		}
		return dp[n];
	}
}
