package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class BinaryTreeLevelTraversal {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		root.left = a;
		root.right = b;
		ArrayList<ArrayList<Integer>> A = levelTrav(root);
		Collections.reverse(A);
		System.out.println(A);
	}

	public static ArrayList<ArrayList<Integer>> levelTrav(TreeNode root) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return A;
		LinkedList<TreeNode> nodeQ = new LinkedList<TreeNode>();
		LinkedList<Integer> levelQ = new LinkedList<Integer>();
		nodeQ.add(root);
		levelQ.add(0);
		while (!nodeQ.isEmpty()) {
			TreeNode node = nodeQ.removeFirst();
			int level = levelQ.removeFirst();
			if (node.left != null) {
				nodeQ.add(node.left);
				levelQ.add(level + 1);
			}
			if (node.right != null) {
				nodeQ.add(node.right);
				levelQ.add(level + 1);
			}
			if (A.size() <= level)
				A.add(new ArrayList<Integer>());
			A.get(level).add(node.val);
		}
		return A;
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
				A.add(new ArrayList<Integer>(temp));
				temp.clear();
			}
		}

		return A;
	}
}
