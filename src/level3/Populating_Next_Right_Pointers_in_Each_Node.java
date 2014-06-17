package level3;

public class Populating_Next_Right_Pointers_in_Each_Node {
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		connect(root.left, root.right);
	}

	private void connect(TreeLinkNode n1, TreeLinkNode n2) {
		if (n1 == null || n2 == null)
			return;
		n1.next = n2;
		connect(n1.left, n1.right);
		connect(n1.right, n2.left);
		connect(n2.left, n2.right);
	}
}
