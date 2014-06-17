package level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {

	public static void main(String[] args) {
		N_Queens n = new N_Queens();
		ArrayList<String[]> ans = (ArrayList<String[]>) n.solveNQueens(8);
		for (String[] sol : ans) {
			for (String s : sol)
				System.out.println(s);
			System.out.println();
		}
		System.out.println(ans.size());

	}

	public List<String[]> solveNQueens(int n) {
		List<String[]> ans = new ArrayList<String[]>();
		int row[] = new int[n + 1];
		Arrays.fill(row, -1);
		solveNQueens(ans, row, 1, n);
		return ans;
	}

	private void solveNQueens(List<String[]> ans, int[] row, int rowPos, int n) {
		if (rowPos > n && n > 0) {
			String[] sol = new String[n];
			for (int i = 0; i < n; i++) {
				char[] chs = new char[n];
				Arrays.fill(chs, '.');
				chs[row[i + 1]-1] = 'Q';
				sol[i] = new String(chs);
			}
			ans.add(sol);
		} else {
			for (int i = 1; i <= n; i++) {
				row[rowPos] = i;
				if (canPlace(row, rowPos)) {
					solveNQueens(ans, row, rowPos + 1, n);
				}
			}
		}
	}

	private boolean canPlace(int[] row, int t) {
		for (int i = 1; i < t; i++) {
			if (row[t] == row[i] || Math.abs(t - i) == Math.abs(row[t] - row[i]))
				return false;
		}
		return true;
	}
}
