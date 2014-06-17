package level3;

import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {

	}

	public ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> ans = new ArrayList<String>();
		combine(digits, ans, 0, "");
		return ans;
	}

	private void combine(String digits, ArrayList<String> ans, int start, String str) {
		if (start >= digits.length()) {
			ans.add(str);
			return;
		}
		int index = digits.charAt(start) - '0';
		for (int i = 0; i < table[index].length(); i++) {
			combine(digits, ans, start + 1, str + table[index].charAt(i));
		}
	}

	private static final String[] table = { " ",// 0
			"",// 1
			"abc",// 2
			"def",// 3
			"ghi",// 4
			"jkl",// 5
			"mno",// 6
			"pqrs",// 7
			"tuv",// 8
			"wxyz"// 9
	};
}
