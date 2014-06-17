package level3;

import common.TreeNode;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
	private void intraverse(TreeNode root) {
		if (root == null)
			return;
		intraverse(root.left);
		System.out.print(root.val + " ");
		intraverse(root.right);
	}

	private void pretraverse(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		pretraverse(root.left);
		pretraverse(root.right);
	}

	public static void main(String[] args) {
		Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal c = new Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal();
		TreeNode root = c.buildTree(new int[] { 1, 2, 3, 4 }, new int[] { 3, 2, 4, 1 });
		c.pretraverse(root);
		System.out.println();
		c.intraverse(root);

	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return buildTree(inorder, 0, postorder, 0, postorder.length);
	}

	private TreeNode buildTree(int[] in, int iStart, int[] po, int pStart, int len) {
		if (len == 0)
			return null;
		int val = po[pStart + len - 1];
		TreeNode root = new TreeNode(val);
		int i = iStart;
		for (; i < iStart + len; i++) {
			if (in[i] == val) {
				break;
			}
		}
		int leftLen = i - iStart;
		int rightLen = len - leftLen - 1;
		root.left = buildTree(in, iStart, po, pStart, leftLen);
		root.right = buildTree(in, i + 1, po, i - iStart + pStart, rightLen);
		return root;
	}
}
