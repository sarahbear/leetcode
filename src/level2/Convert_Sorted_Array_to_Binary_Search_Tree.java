package level2;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static TreeNode sortedArrayToBST(int[] num) {
		if (num.length == 0)
			return null;
		TreeNode root = buildTree(num, 0, num.length - 1);
		return root;
	}

	private static TreeNode buildTree(int[] num, int left, int right) {
		if (left > right)
			return null;
		int mid = (left + right) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = buildTree(num, 0, mid - 1);
		root.right = buildTree(num, mid + 1, right);
		return root;
	}
}
