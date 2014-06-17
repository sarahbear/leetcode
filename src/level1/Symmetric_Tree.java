package level1;

public class Symmetric_Tree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymTree(root.left, root.right);
	}

	private static boolean isSymTree(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == null && right == null;

		return left.val == right.val && isSymTree(left.left, right.right) && isSymTree(left.right, right.left);
	}
}
