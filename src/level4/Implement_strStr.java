package level4;

public class Implement_strStr {

	public static void main(String[] args) {
		System.out.println(strStr("aaacbb", "aac"));
	}

	public static String strStr(String haystack, String needle) {
		int hlen = haystack.length();
		int nlen = needle.length();
		if (nlen > hlen)
			return null;
		for (int i = 0; i <= hlen - nlen; i++) {
			boolean find = true;
			for (int j = 0; j < nlen; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					find = false;
					break;
				}
			}
			if (find)
				return haystack.substring(i);
		}
		return null;
	}
}
