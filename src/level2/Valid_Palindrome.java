package level2;

public class Valid_Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome2("1a2"));
	}

	public static boolean isPalindrome(String s) {
		if (s.isEmpty())
			return true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c >= '0' && c <= '9') {
				sb.append(s.charAt(i));
			}
		}
		String str = sb.toString().toLowerCase();
		int len = str.length();
		for (int i = 0, j = len - 1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome2(String s) {//Accepted
		if (s.isEmpty())
			return true;
		String str = s.toLowerCase();
		for (int i = 0, j = str.length() - 1; i < j;i++,j--) {
			while (i<j&&!Character.isLetterOrDigit(str.charAt(i)))
				i++;
			while (i<j&&!Character.isLetterOrDigit(str.charAt(j)))
				j--;
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
}
