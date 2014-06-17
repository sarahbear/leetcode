package level3;

import common.TreeNode;

public class Validate_Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isValidBST(TreeNode node, int minValue, int maxValue) {
		if (node == null)
			return true;
		if (node.val <= minValue || node.val >= maxValue)
			return false;
		return isValidBST(node.left, minValue, node.val)
				&& isValidBST(node.right, node.val, maxValue);
	}
}
