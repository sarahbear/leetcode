package level1;

public class Same_Tree {
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
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
			return p == null && q == null;
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
