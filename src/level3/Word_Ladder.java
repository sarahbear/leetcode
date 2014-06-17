package level3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Word_Ladder {

	public static void main(String[] args) {

	}

	public int ladderLength(String start, String end, Set<String> dict) {
		if (start == null || end == null || start.equals(end) || start.length() != end.length())
			return 0;
		if (isOneWordDiff(start, end))
			return 2;

		Queue<String> q = new LinkedList<String>();
		Map<String, Integer> m = new HashMap<String, Integer>();
		q.add(start);
		m.put(start, 1);
		while (!q.isEmpty()) {
			String head = q.poll();
			int len = m.get(head);
			for (int i = 0; i < head.length(); i++) {
				for (char c = 'a'; c < 'z'; c++) {
					if (head.charAt(i) == c)
						continue;
					StringBuilder sb = new StringBuilder(head);
					sb.setCharAt(i, c);
					if (sb.toString().equals(end))
						return len + 1;
					if (dict.contains(sb.toString()) && !m.containsKey(sb.toString())) {
						q.add(sb.toString());
						m.put(sb.toString(), len + 1);
					}
				}
			}
		}
		return 0;
	}

	private boolean isOneWordDiff(String a, String b) {
		int d = 0;
		for (int i = 0, len = a.length(); i < len; i++) {
			if (a.charAt(i) != b.charAt(i)) {
				d++;
				if (d >= 2)
					return false;
			}
		}
		return d == 1;
	}
}
