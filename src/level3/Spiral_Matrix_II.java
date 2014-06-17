package level3;

public class Spiral_Matrix_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[][] generateMatrix(int n) {
		int[][] m = new int[n][n];
		int num = 1;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				m[i][j] = num++;
			}
			for (int j = i; j < n - i - 1; j++) {
				m[j][n - i - 1] = num++;
			}
			for (int j = n - i - 1; j > i; j--) {
				m[n - i - 1][j] = num++;
			}
			for (int j = n - i - 1; j > i; j--) {
				m[j][i] = num++;
			}
		}
		if (n % 2 == 1) {
			m[n / 2][n / 2] = num;
		}
		return m;
	}
}
