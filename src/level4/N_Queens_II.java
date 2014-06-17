package level4;

import java.util.Arrays;

public class N_Queens_II {

	public static void main(String[] args) {
		System.out.println(new N_Queens_II().totalNQueens(4));
	}

	int sum = 0;

	// Recuision traceback
	public int totalNQueens(int n) {
		if (n == 0)
			return 0;
		int[] row = new int[n + 1];
		Arrays.fill(row, 0);
		queen(n, 1, row);
		return sum;
	}

	private int queen(int n, int t, int[] row) {
		if (t > n && n > 0) {
			sum++;
		} else {
			for (int i = 1; i <= n; i++) {
				row[t] = i;
				if (canPlace(row, t)) {
					queen(n, t + 1, row);
				}
			}
		}
		return sum;
	}

	private boolean canPlace(int[] row, int t) {
		for (int i = 1; i < t; i++) {
			if (row[t] == row[i] || Math.abs(t - i) == Math.abs(row[t] - row[i]))
				return false;
		}
		return true;
	}

	// Iterative traceback :::not understand!!!!!!!! 555555555555555
	public int totalNQueens2(int n) {
		if (n == 0)
			return 0;
		int[] row = new int[n + 1];
		Arrays.fill(row, 0);
		queen2(n, 1, row);
		return sum;
	}

	private int queen2(int n, int i, int[] row) {
		row[1] = 0;
		int t = 1;
		while (t > 0) {
			row[t] += 1;
			while (row[t] <= n && !canPlace(row, t)){
				row[t]++;
			}
			if (row[t] <= n){
				if (t == n){
					sum++;
				}else{
					row[++t] = 0;
				}
			}else{
				t--;
			}
		}
		return sum;
	}
}
