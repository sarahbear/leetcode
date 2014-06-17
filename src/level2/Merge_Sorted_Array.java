package level2;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int A[], int m, int B[], int n) {
		int pos = m + n - 1;
		int i = m - 1;
		int j = n - 1;
		for (; i >= 0 && j >= 0;) {
			if (A[i] > B[j]) {
				A[pos--] = A[i--];
			} else {
				A[pos--] = B[j--];
			}
		}
		while (i >= 0)
			A[pos--] = A[i--];
		while (j >= 0)
			A[pos--] = B[j--];
	}
}
