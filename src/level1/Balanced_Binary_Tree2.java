package level1;

public class Balanced_Binary_Tree2 {
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

	public static boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		return isBalanced(root.left) && isBalanced(root.right)
				&& (Math.abs(height(root.left) - height(root.right)) <= 1);
	}

	private static int height(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	/**
	 * 218 / 226 test cases passed
	 *  Input: {1,2,2,3,3,3,3,4,4,4,4,4,4,#,#,5,5}
	 * Output: false Expected: true
	 */
	public static boolean isBalanced1(TreeNode root) {
		return maxHeight(root) - minHeight(root) <= 1;
	}

	private static int maxHeight(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + Math.max(maxHeight(node.left), maxHeight(node.right));
	}

	private static int minHeight(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + Math.min(minHeight(node.left), minHeight(node.right));
	}
}
