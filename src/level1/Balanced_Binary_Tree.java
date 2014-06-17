package level1;

public class Balanced_Binary_Tree {
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
		if (Math.abs(depth(root.left) - depth(root.right)) > 1)
			return false;
		return isBalanced(root.left) && isBalanced(root.right);
	}

	private static int depth(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + Math.max(depth(node.left), depth(node.right));
	}
}
