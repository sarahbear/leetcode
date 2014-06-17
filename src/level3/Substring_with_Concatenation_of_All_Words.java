package level3;

import java.util.ArrayList;
import java.util.HashMap;

public class Substring_with_Concatenation_of_All_Words {//WA

	public static void main(String[] args) {
		String s="a";
		String[] L={"a"};
		System.out.println(findSubstring(s, L));
	}

	public static ArrayList<Integer> findSubstring(String S, String[] L) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();// <str,count>
		for (String s : L) {
			Integer count = map.get(s);
			if (count == null)
				map.put(s, 1);
			else
				map.put(s, count + 1);
		}

		int wordLen = L[0].length();
		int windowLen = wordLen * L.length;
		for (int i = 0, sLen = S.length(); i <= sLen - windowLen; i++) {
			HashMap<String, Integer> t = new HashMap<String, Integer>();
			boolean skip = false;
			for (int j = i; j < i + windowLen; j += wordLen) {
				String sub = S.substring(j, j + wordLen);
				Integer ocount = map.get(sub);
				Integer count = t.get(sub);
				if (ocount == null || (count != null && ocount == count)) {
					skip = true;
					break;
				}
				if (count == null)
					t.put(sub, 1);
				else
					t.put(sub, count + 1);
			}
			if(!skip)
				ans.add(i);
		}
		return ans;
	}
}
