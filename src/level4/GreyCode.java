package level4;

import java.util.ArrayList;

public class GreyCode {

	public static void main(String[] args) {
		grayCode(2);
	}

	public static ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> A = new ArrayList<Integer>(2 ^ n);
		if (n == 0) {
			A.add(0);
			return A;
		}
		A.add(0);
		A.add(1);
		if (n == 1)
			return A;
		for (int c = 2; c <= n; c++) {
			for (int i = (int) Math.pow(2, c - 1); i <= (Math.pow(2, c) - 1); i++) {
				int index = (int) (Math.pow(2, c) - i - 1);
				A.add(A.get(index));
			}
			for (int j = (int) Math.pow(2, c - 1); j < Math.pow(2, c); j++) {
				A.set(j, (int) (A.get(j) + Math.pow(2, c - 1)));
			}
		}
		return A;
	}
}
