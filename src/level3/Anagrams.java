package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> anagrams(String[] strs) {
		ArrayList<String> ans = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strs.length; i++) {
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			String sorted = new String(c);
			Integer flag = map.get(sorted);
			if (flag == null) {
				map.put(sorted, i);
			} else {
				ans.add(strs[i]);
				if (flag != -1) {
					ans.add(strs[flag]);
					map.put(sorted, -1);
				}
			}
		}
		return ans;
	}
}
