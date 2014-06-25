package level4;

import common.TreeNode;

public class Recover_Binary_Search_Tree {
	TreeNode s1;
	TreeNode s2;
	TreeNode pre;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void recoverTree(TreeNode root) {
		s1 = null;
		s2 = null;
		pre = null;

		search(root);
		swap(s1, s2);
	}

	private void search(TreeNode node) {
		if (node == null)
			return;
		search(node.left);
		if (pre != null && pre.val > node.val) {
			if (s1 == null) {
				s1 = pre;
			}
			s2 = node;
		}
		pre = node;
		search(node.right);
	}

	private void swap(TreeNode s1, TreeNode s2) {
		int tmp = s1.val;
		s1.val = s2.val;
		s2.val = tmp;
	}
}
