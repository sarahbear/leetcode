package level3;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {

	}

	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<String>();
		search(ans, digits, 0, "");
		return ans;
	}

	private void search(List<String> ans, String digits, int pos, String s) {
		if (pos >= digits.length()) {
			ans.add(s);
			return;
		}
		int index = digits.charAt(pos) - '0';
		for (int i = 0; i < table[index].length(); i++) {
			search(ans, digits, pos + 1, s + table[index].charAt(i));
		}
	}

	private static final String[] table = { 
		" ",
		"", 
		"abc", 
		"def", 
		"ghi", 
		"jkl", 
		"mno", 
		"pqrs",
		"tuv", 
		"wxyz" 
	};
}
