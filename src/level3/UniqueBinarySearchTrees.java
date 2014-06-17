package level3;
public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		System.out.println(numTrees1(4));
	}

	public static int numTrees(int n) {
		if (n <= 1)
			return 1;
		return (numTrees(n - 1)) * (4 * n - 2) / (n + 1);
	}

	public static int numTrees1(int n) {
		if (n <= 1)
			return 1;
		if (n == 2)
			return 2;
		int res = 0;
		int i = 0;
		int j = n - 1;
		for (; i < j; i++, j--) {
			res = res + 2 * numTrees1(i) * numTrees1(j);
		}
		if (i == j)
			res += numTrees1(i) * numTrees1(j);
		return res;
	}
	
	public int numTrees2(int n) {
        if (n <= 1)
			return 1;
		if (n == 2)
			return 2;
		int res = 0;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			res = res + 2 * numTrees2(i) * numTrees2(j);
		}
		return n % 2 == 0 ? res : res + numTrees2(n / 2) * numTrees2(n / 2);
    }
}
