package level2;

import common.ListNode;

public class Swap_Nodes_in_Pairs {

	public static void main(String[] args) {
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode newHead = head.next;
		head.next = swapPairs(newHead.next);
		newHead.next = head;
		return newHead;
	}
}
