package level3;

import common.TreeNode;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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
		Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal c = new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
		TreeNode root = c.buildTree(new int[] { 1, 2, 4, 3, 5 }, new int[] { 2, 4, 1, 5, 3 });
		c.pretraverse(root);
		System.out.println();
		c.intraverse(root);
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTree(preorder, 0, inorder, 0, inorder.length);
	}

	private TreeNode buildTree(int[] pre, int preStart, int[] in, int inStart, int inEnd) {
		if (inStart >= inEnd)
			return null;
		int pos = inStart;
		for (int i = inStart; i <= inEnd; i++) {
			if (in[i] == pre[preStart]) {
				pos = i;
				break;
			}
		}
		TreeNode root = new TreeNode(pre[preStart]);
		root.left = buildTree(pre, preStart + 1, in, inStart, pos);
		root.right = buildTree(pre, pos - inStart + preStart + 1, in, pos + 1, inEnd);
		return root;
	}
}
