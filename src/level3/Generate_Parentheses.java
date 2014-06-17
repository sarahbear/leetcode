package level3;

import java.util.ArrayList;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> ans = new ArrayList<String>();
		generate(n, n, "", ans);
		return ans;
	}

	private static void generate(int left, int right, String s, ArrayList<String> ans) {
		if (left == 0 && right == 0) {
			ans.add(s);
			return;
		}
		if (left > 0)
			generate(left - 1, right, s + "(", ans);
		if (right > 0 && left < right)
			generate(left, right - 1, s + ")", ans);
	}
}
