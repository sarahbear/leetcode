package level3;

public class Unique_Paths_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] a = new int[m][n];
		for (int i = m - 1; i >= 0; i--) {
			if (obstacleGrid[i][n - 1] == 1)
				break;
			a[i][n - 1] = 1;
		}
		for (int j = n - 1; j >= 0; j--) {
			if (obstacleGrid[m - 1][j] == 1)
				break;
			a[m - 1][j] = 1;
		}
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				if (obstacleGrid[i][j] == 1)
					continue;
				a[i][j] = a[i + 1][j] + a[i][j + 1];
			}
		}
		return a[0][0];
	}
}
