package level4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import common.TreeNode;

public class Unique_Binary_Search_Trees_II {

	public static void main(String[] args) {
	}

	public List<TreeNode> generateTrees(int n) {
		return generate(1, n);
	}

	private List<TreeNode> generate(int start, int end) {
		List<TreeNode> ans = new ArrayList<TreeNode>();
		if (start > end) {
			ans.add(null);
			return ans;
		}
		for (int i = start; i <= end; i++) {
			for (TreeNode left : generate(start, i - 1)) {
				for (TreeNode right : generate(i + 1, end)) {
					TreeNode node = new TreeNode(i);
					node.left = left;
					node.right = right;
					ans.add(node);
				}
			}
		}
		return ans;
	}
}
