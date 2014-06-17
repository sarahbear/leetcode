package level3;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreeLevelOrderTraversal {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return A;

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		ArrayList<Integer> temp = new ArrayList<Integer>();
		int numNextLevel = 0;
		int numCurLevel = 1;

		while (!queue.isEmpty()) {
			TreeNode node = queue.removeFirst();
			numCurLevel--;
			temp.add(node.val);
			if (node.left != null) {
				queue.add(node.left);
				numNextLevel++;
			}
			if (node.right != null) {
				queue.add(node.right);
				numNextLevel++;
			}
			if (numCurLevel == 0) {
				numCurLevel = numNextLevel;
				numNextLevel = 0;
				A.add(temp);
				temp.clear();
			}
		}

		return A;
	}
}
