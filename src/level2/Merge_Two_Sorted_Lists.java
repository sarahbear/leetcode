package level2;


public class Merge_Two_Sorted_Lists {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode node = new ListNode(0);
		ListNode head = node;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				node.next = l1;
				node = node.next;
				l1 = l1.next;
			} else {
				node.next = l2;
				node = node.next;
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			node.next = l1;
		}
		if (l2 != null) {
			node.next = l2;
		}
		return head.next;
	}
}
