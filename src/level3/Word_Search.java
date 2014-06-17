package level3;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				if (search(board, i, j, 0, word))
					return true;
		return false;
	}

	private static boolean search(char[][] board, int i, int j, int begin, String word) {
		if (begin == word.length())
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
			return false;
		if (board[i][j] == '*' || board[i][j] != word.charAt(begin))
			return false;
		char c = board[i][j];
		board[i][j] = '*';
		boolean res = search(board, i + 1, j, begin + 1, word)
				|| search(board, i, j + 1, begin + 1, word)
				|| search(board, i - 1, j, begin + 1, word)
				|| search(board, i, j - 1, begin + 1, word);
		board[i][j] = c;
		return res;
	}
}
