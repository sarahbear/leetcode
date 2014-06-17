package level3;

import java.util.Stack;

public class FlattenBinaryTree {// 3
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

	private static TreeNode lastVisited = null;

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		TreeNode saveRight = root.right;

		if (lastVisited != null) {
			lastVisited.right = root;
			lastVisited.left = null;
		}
		lastVisited = root;

		flatten(root.left);
		flatten(saveRight);
	}

	public void flatten2(TreeNode root) {
		while (root != null) {
			if (root.left != null) {
				TreeNode node = root.left;
				while (node.right != null)
					node = node.right;
				node.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			root = root.right;
		}
	}

	public void flatten3(TreeNode root) {
		if (root == null)
			return;

		TreeNode left = root.left;
		TreeNode right = root.right;

		if (left != null) {
			root.right = left;
			root.left = null;

			TreeNode rightmost = left;
			while (rightmost.right != null) {
				rightmost = rightmost.right;
			}
			rightmost.right = right;
		}
		flatten3(root.right);
	}

	public void flatten4(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		pTrav(root, s);
		TreeNode pre = null;
		while (!s.isEmpty()) {
			TreeNode cur = s.pop();
			cur.left = null;
			cur.right = pre;
			pre = cur;
		}
	}

	private void pTrav(TreeNode root, Stack<TreeNode> s) {
		if (root == null)
			return;
		s.push(root);
		pTrav(root.left, s);
		pTrav(root.right, s);
	}
}
