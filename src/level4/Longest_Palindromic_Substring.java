package level4;

public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String longestPalindrome(String s) {
		if (s.length() <= 1)
			return s;
		int start = 0;
		int end = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			int j = 0;
			for (; j <= i && i + j < len; j++) {
				if (s.charAt(i - j) != s.charAt(i + j))
					break;
			}
			if (2 * j - 1 > end - start) {
				start = i - j + 1;
				end = i + j - 1;
			}

			for (j = 0; j <= i && i + j + 1 < len; j++) {
				if (s.charAt(i - j) != s.charAt(i + j + 1))
					break;
			}
			if (2 * j > end - start) {
				start = i - j + 1;
				end = i + j;
			}
		}
		return s.substring(start, end + 1);
	}
}
