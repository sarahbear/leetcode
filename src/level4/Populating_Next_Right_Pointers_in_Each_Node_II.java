package level4;

import java.util.LinkedList;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node_II {
	static class TreeLinkNode {
		int val;
		TreeLinkNode left;
		TreeLinkNode right;
		TreeLinkNode next;

		TreeLinkNode(int x) {
			val = x;
		}

		public String toString() {
			return val + "";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
		Queue<Integer> levelQ = new LinkedList<Integer>();
		q.add(root);
		levelQ.add(0);
		int curLevel = -1;
		TreeLinkNode curNode = null;
		while (!q.isEmpty()) {
			TreeLinkNode node = q.poll();
			int level = levelQ.poll();
			if (level != curLevel) {
				curLevel = level;
				curNode = node;
			} else {
				curNode.next = node;
				curNode = node;
			}
			if (node.left != null) {
				q.add(node.left);
				levelQ.add(level + 1);
			}
			if (node.right != null) {
				q.add(node.right);
				levelQ.add(level + 1);
			}
		}
	}
}
