package level2;

import common.TreeNode;

public class Sum_Root_to_Leaf_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		return sumNumbers(root, root.val);
	}

	private int sumNumbers(TreeNode root, int base) {
		if (root.left == null && root.right == null)
			return base;
		int sum = 0;
		if (root.left != null)
			sum += sumNumbers(root.left, base * 10 + root.left.val);
		if (root.right != null)
			sum += sumNumbers(root.right, base * 10 + root.right.val);
		return sum;
	}
}
