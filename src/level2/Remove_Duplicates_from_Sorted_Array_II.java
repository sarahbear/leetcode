package level2;

public class Remove_Duplicates_from_Sorted_Array_II {

	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 2, 2, 3 };
		int b = removeDuplicates(A);
		System.out.println(b);
	}

	public static int removeDuplicates(int[] A) {
		int pos = 0;
		if (A.length == 0)
			return 0;
		int count = 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[pos]) {
				count++;
				if (count <= 2) {
					A[++pos] = A[i];
				}
			} else {
				count = 1;
				A[++pos] = A[i];
			}
		}
		return pos + 1;
	}
}
