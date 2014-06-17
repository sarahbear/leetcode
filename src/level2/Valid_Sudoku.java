package level2;

import java.util.Arrays;

public class Valid_Sudoku {

	public static void main(String[] args) {
		String str[] = { ".........", "......3..", "...18....", "...7.....",
				"....1.97.", ".........", "...36.1..", ".........", ".......2." };
		char ch[][] = new char[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				ch[i][j] = str[i].charAt(j);

		System.out.println(isValidSudoku(ch));

	}

	public static boolean isValidSudoku(char[][] board) {
		boolean[] o = new boolean[9];
		for (int i = 0; i < 9; i++) {
			Arrays.fill(o, false);
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;
				int index = board[i][j] - '1';
				if (o[index])
					return false;
				o[index] = true;
			}
		}

		for (int j = 0; j < 9; j++) {
			Arrays.fill(o, false);
			for (int i = 0; i < 9; i++) {
				if (board[i][j] == '.')
					continue;
				int index = board[i][j] - '1';
				if (o[index])
					return false;
				o[index] = true;
			}
		}

		for (int cube = 0; cube < 9; cube++) {
			int rowStart = cube / 3 * 3;
			int colStart = cube % 3 * 3;
			Arrays.fill(o, false);
			for (int i = 0; i < 9; i++) {
				char c = board[rowStart + i / 3][colStart + i % 3];
				if (c == '.')
					continue;
				int index = c - '1';
				if (o[index])
					return false;
				o[index] = true;
			}
		}
		return true;
	}
}
