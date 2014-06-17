package level3;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {

	}

	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		dfs(res, new ArrayList<String>(), s);
		return res;
	}

	public void dfs(List<List<String>> res, List<String> tmp, String s) {
		if (s.length() == 0) {
			res.add(new ArrayList<String>(tmp));
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String sub = s.substring(0, i);
			if (isPalindrome(sub, 0, sub.length() - 1)) {
				tmp.add(sub);
				dfs(res, tmp, s.substring(i));
				tmp.remove(tmp.size() - 1);
			}
		}
	}

	public boolean isPalindrome(String s, int start, int end) {
		while (start < end)
			if (s.charAt(start++) != s.charAt(end--))
				return false;
		return true;
	}
}
