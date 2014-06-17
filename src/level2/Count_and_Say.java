package level2;

public class Count_and_Say {

	public static void main(String[] args) {
		System.out.println(countAndSay(6));

	}

	public static String countAndSay(int n) {
		String s = "1";
		for (int i = 2; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			char ch = s.charAt(0);
			int count = 1;
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j) == ch)
					count++;
				else {
					sb.append(count).append(ch);
					ch = s.charAt(j);
					count = 1;
				}
			}
			sb.append(count).append(ch);
			s = sb.toString();
		}
		return s;
	}
}
