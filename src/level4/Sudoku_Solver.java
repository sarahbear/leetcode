package level4;

public class Sudoku_Solver {

	public static void main(String[] args) {

	}

	public void solveSudoku(char[][] board) {
		search(board, 0);
	}

	private boolean search(char[][] board, int p) {
		while (p < 81) {
			if (board[p / 9][p % 9] == '.') {
				break;
			}
			p++;
		}
		if (p == 81) {
			return true;
		}
		int row = p / 9;
		int col = p % 9;
		for (char c = '1'; c <= '9'; c++) {
			if (isValid(board, row, col, c)) {
				board[row][col] = c;
				if (search(board, p + 1)) {
					return true;
				}
			}
		}
		board[row][col] = '.';
		return false;
	}

	private boolean isValid(char[][] board, int row, int col, char c) {
		int cellRow = row - row % 3;
		int cellCol = col - col % 3;
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == c || board[i][col] == c
					|| board[cellRow + i / 3][cellCol + i % 3] == c) {
				return false;
			}
		}
		return true;
	}
}
