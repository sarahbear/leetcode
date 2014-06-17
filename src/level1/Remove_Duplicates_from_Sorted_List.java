package level1;

public class Remove_Duplicates_from_Sorted_List {
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

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode node = head;
		int curVal = head.val;
		while (node.next != null) {
			ListNode next=node.next;
			if (next.val == curVal) {
				node.next=next.next;
			} else {
				curVal=next.val;
				node = next;
			}
		}
		return head;
	}
}
