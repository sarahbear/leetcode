package level3;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int i = 0;
		int p = rows * cols - 1;
		while (i <= p) {
			int m = (i + p) >>> 1;
			int x = m / cols;
			int y = m % cols;
			if (matrix[x][y] == target)
				return true;
			else if (matrix[x][y] < target)
				i = m + 1;
			else
				p = m - 1;
		}
		return false;
	}

	public int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		int mid = 0;
		while (left <= right) {
			mid = (left + right) >>> 1;
			if (array[mid] == target)
				return mid;
			else if (array[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -left - 1;
	}
}
