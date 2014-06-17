package level2;

import java.util.ArrayList;

import common.TreeNode;

public class Path_Sum_II {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		ArrayList<ArrayList<Integer>> a= pathSum(root,1); 
		System.out.println(a);
	}

	public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return A;
		ArrayList<Integer> path = new ArrayList<Integer>();
		getSum(root, sum, A, path);
		return A;
	}

	private static void getSum(TreeNode root, int sum, ArrayList<ArrayList<Integer>> a, ArrayList<Integer> path) {
		path.add(root.val);
		if (root.left == null && root.right == null && root.val == sum) {
			a.add(new ArrayList<Integer>(path));
			path.remove(path.size()-1);
			return;
		}
		if (root.left != null)
			getSum(root.left, sum - root.val, a, path);
		if (root.right != null)
			getSum(root.right, sum - root.val, a, path);
		path.remove(path.size()-1);
	}
}
