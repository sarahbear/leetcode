package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.TreeNode;

public class Binary_Tree_Level_Order_Traversal_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null)
			return ans;
		search(root, 0, ans);
		Collections.reverse(ans);
		return ans;
	}

	private void search(TreeNode root, int level, List<List<Integer>> ans) {
		if (root == null)
			return;
		if (level >= ans.size())
			ans.add(new ArrayList<Integer>());
		ans.get(level).add(root.val);
		search(root.left, level + 1, ans);
		search(root.right, level + 1, ans);
	}
}
