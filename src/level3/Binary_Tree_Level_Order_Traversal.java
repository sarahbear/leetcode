package level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import common.TreeNode;

public class Binary_Tree_Level_Order_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return ans;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> levelQ = new LinkedList<Integer>();
		q.add(root);
		levelQ.add(0);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			int level = levelQ.poll();
			if (node.left != null) {
				q.add(node.left);
				levelQ.add(level + 1);
			}
			if (node.right != null) {
				q.add(node.right);
				levelQ.add(level + 1);
			}
			if (ans.size() <= level)
				ans.add(new ArrayList<Integer>());
			ans.get(level).add(node.val);
		}
		return ans;
	}
}
