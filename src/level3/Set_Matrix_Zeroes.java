package level3;

public class Set_Matrix_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[] rowZeros = new boolean[m];
		boolean[] colZeros = new boolean[n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					rowZeros[i] = true;
					colZeros[j] = true;
				}
			}
		for (int i = 0; i < m; i++)
			if (rowZeros[i])
				for (int j = 0; j < n; j++)
					matrix[i][j] = 0;
		for (int j = 0; j < n; j++)
			if (colZeros[j])
				for (int i = 0; i < m; i++)
					matrix[i][j] = 0;
	}
}
