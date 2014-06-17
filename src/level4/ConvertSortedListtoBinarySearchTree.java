package level4;
public class ConvertSortedListtoBinarySearchTree {// 4
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static TreeNode sortedListToBST(ListNode head) {
		ListNode node = head;
		int n = 0;
		while (node != null) {
			n++;
			node = node.next;
		}
		return buildTree(head, n);
	}

	private static TreeNode buildTree(ListNode head, int n) {
		if (head == null || n == 0)
			return null;
		ListNode node = head;
		int mid = (n + 1) / 2;
		for (int i = 1; i < mid; i++) {
			node = node.next;
		}
		TreeNode root = new TreeNode(node.val);
		root.left = buildTree(head, mid - 1);
		root.right = buildTree(node.next, n - mid);
		return root;
	}

	/********************* ��һ�ַ��� **************************************************************/
	public static TreeNode sortedListToBST2(ListNode head) {
		return rec(head, null);
	}

	private static TreeNode rec(ListNode start, ListNode end) {
		if (start == end)
			return null;
		ListNode mid = start;
		ListNode probe = start;
		while (probe != end && probe.next != end) {
			mid = mid.next;
			probe = probe.next.next;
		}
		TreeNode root = new TreeNode(mid.val);
		root.left = rec(start, mid);
		root.right = rec(mid.next, end);
		return root;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(-10);
		ListNode n2 = new ListNode(-3);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(9);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		TreeNode root = sortedListToBST2(head);
		System.out.println(root.val);
	}
}
