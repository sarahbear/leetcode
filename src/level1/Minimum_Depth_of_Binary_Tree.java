package level1;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Depth_of_Binary_Tree {
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

	public static int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		q.offer(root);
		level.offer(1);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			int i = level.poll();
			if (node.left == null && node.right == null)
				return i;
			if (node.left != null) {
				q.offer(node.left);
				level.offer(i + 1);
			}
			if (node.right != null) {
				q.offer(node.right);
				level.offer(i + 1);
			}
		}
		return -1;
	}
}
