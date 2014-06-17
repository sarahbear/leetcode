package level3;

public class ZigZag_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String convert(String s, int nRows) {
		if (s.length() <= nRows || nRows == 1)
			return s;
		String[] strs = new String[nRows];
		for (int i = 0; i < nRows; i++)
			strs[i] = "";
		
		int count = 0;
		int flag = 1;
		for (int i = 0; i < s.length(); i++) {
			if (count == 0)
				flag = 1;
			else if (count == nRows - 1)
				flag = -1;
			strs[count] += s.charAt(i);
			count += flag;
		}

		String res = "";
		for (String str : strs)
			res += str;
		return res;
	}
}
