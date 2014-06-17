package level2;

public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println(isPalindrome(123421));

	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int d = 1;
		while (x / d >= 10) {
			d = d * 10;
		}
		while (x > 0) {
			if (x % 10 != x / d) {
				return false;
			}
			x = (x % d) / 10;
			d /= 100;
		}
		return true;
	}
}
