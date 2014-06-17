package level3;

import java.util.Arrays;

public class Jump_Game {

	public static void main(String[] args) {
		int[] A = { 3, 2, 1, 0, 4 };
		System.out.println(canJump(A));
	}

	public static boolean canJump(int[] A) {
		if (A.length == 0 || A.length == 1)
			return true;
		int far = A[0];
		for (int i = 1; i < A.length && i <= far; i++) {
			far = Math.max(far, i + A[i]);
			if (far >= A.length - 1)
				return true;
		}
		return false;
	}

	public static boolean canJump1(int[] A) {// TLE
		if (A.length == 0 || A.length == 1)
			return true;
		boolean[] list = new boolean[A.length];
		Arrays.fill(list, false);
		list[0] = true;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				for (int j = i + 1; j <= i + A[i] && j < A.length; j++) {
					list[j] = true;
				}
			}
		}
		return list[A.length - 1];
	}
}
