package level2;

public class Add_Binary {

	public static void main(String[] args) {
		System.out.println(addBinary("1", "111"));
	}

	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int al = a.length() - 1;
		int bl = b.length() - 1;
		int carry = 0;
		while (al >= 0 && bl >= 0) {
			int i = a.charAt(al--) - '0' + b.charAt(bl--) - '0' + carry;
			carry = i / 2;
			sb.insert(0, i % 2);
		}
		while (al >= 0) {
			int i = a.charAt(al--) - '0' + carry;
			carry = i / 2;
			sb.insert(0, i % 2);
		}
		while (bl >= 0) {
			int i = b.charAt(bl--) - '0' + carry;
			carry = i / 2;
			sb.insert(0, i % 2);
		}
		if (carry > 0)
			sb.insert(0, 1);
		return sb.toString();
	}
}
