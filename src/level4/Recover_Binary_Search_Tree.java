package level4;

import common.TreeNode;

public class Recover_Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	TreeNode n1;
	TreeNode n2;
	TreeNode pre;

	public void recoverTree(TreeNode root) {
		n1 = null;
		n2 = null;
		pre = null;
		search(root);
		swap(n1, n2);
	}

	private void search(TreeNode node) {
		if (node == null)
			return;
		search(node.left);
		if (pre == null) {
			pre = node;
		}else{
			if(node.val>pre.val){
				
			}
		}
		search(node.right);
	}

	private void swap(TreeNode n1, TreeNode n2) {
		int tmp = n1.val;
		n1.val = n2.val;
		n2.val = tmp;
	}
}
