package unknowlevel;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePostorderTrav {
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
		ArrayList<Integer> A = postorderTraversal(root);
		System.out.println(A);
	}

	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		Stack<TreeNode> t = new Stack<TreeNode>();
		TreeNode node = root;

		while (node != null || !s.isEmpty()) {
			while (node != null) {
				s.push(node);
				t.push(node);
				node = node.right;
			}
			if (!s.isEmpty()) {
				node = s.pop();
				node = node.left;
			}
		}
		while(!t.isEmpty()){
			A.add(t.pop().val);
		}
		return A;
	}
}
