package level3;
/*given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6*/
public class Maximum_Subarray {

	public static void main(String[] args) {
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(A));
	}

	public static int maxSubArray(int[] A) {
		int sum = A[0];
		int t = A[0];
		for (int k = 1; k < A.length; k++) {
			t = t < 0 ? A[k] : t + A[k];//t = Math.max(A[i], t+A[i]);
			sum = Math.max(sum, t);
		}
		return sum;
	}
}
