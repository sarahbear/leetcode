package level4;

import common.TreeNode;

public class Binary_Tree_Maximum_Path_Sum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(-3);
		TreeNode a = new TreeNode(4);
		TreeNode b = new TreeNode(7);
		root.left = a;
		root.right = b;
		System.out.println(maxPathSum(root));
	}

	public static int maxPathSum(TreeNode root) {
		int[] max = new int[1];
		max[0] = Integer.MIN_VALUE;
		maxPathSum(root, max);
		return max[0];
	}

	private static int maxPathSum(TreeNode node, int[] max) {
		if (node == null) {
			return 0;
		}
		int leftSum = maxPathSum(node.left, max);
		int rightSum = maxPathSum(node.right, max);
		int pathSum = node.val;
		pathSum += leftSum > 0 ? leftSum : 0;
		pathSum += rightSum > 0 ? rightSum : 0;
		max[0] = Math.max(pathSum, max[0]);
		return Math.max(Math.max(leftSum, rightSum), 0) + node.val;
	}
}
