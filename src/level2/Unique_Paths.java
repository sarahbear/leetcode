package level2;

public class Unique_Paths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 3));

	}

	public static int uniquePaths(int m, int n) {
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			a[i][n - 1] = 1;
		}
		for (int j = 0; j < n; j++) {
			a[m - 1][j] = 1;
		}
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				a[i][j] = a[i + 1][j] + a[i][j + 1];
			}
		}
		return a[0][0];
	}
}
