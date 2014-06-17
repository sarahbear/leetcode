package level2;
public class Sum_Root_to_Leaf_Numbers2 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		root.left = a;
		root.right = b;

		System.out.println(sumNumbers(root));

	}

	public static int sumNumbers(TreeNode root) {
		return sumR(root, 0);
	}

	private static int sumR(TreeNode root, int sum) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return sum * 10 + root.val;
		int val = 0;
		if (root.left != null)
			val = val + sumR(root.left, sum * 10 + root.val);
		if (root.right != null)
			val = val  + sumR(root.right, sum * 10 + root.val);
		return val;
	}
}
