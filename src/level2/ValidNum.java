package level2;

public class ValidNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isNumber(String s) {
		try {
			if (Character.isLetter(s.charAt(s.length()-1)))
				return false;
			Float.parseFloat(s);
			return true;

		} catch (Exception e) {
			return false;
		}
	}
}
