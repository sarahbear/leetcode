package level1;
public class MinimumDepthofBinaryTree {
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
		a.right = b;
		int n = minDepth2(root);
		System.out.println(n);

	}

	public static int minDepth(TreeNode root) {// AC����������
		if (root == null)
			return 0;
		int i = minDepth(root.left);
		int j = minDepth(root.right);
		if (i == 0)
			return 1 + j;
		if (j == 0)
			return 1 + i;
		return Math.min(i, j) + 1;
	}

	public static int minDepth2(TreeNode root) {// AC
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		if (root.left == null)
			return 1 + minDepth(root.right);
		else if (root.right == null)
			return 1 + minDepth(root.left);
		else
			return 1 + Math.min(minDepth2(root.left), minDepth2(root.right));
	}

}
