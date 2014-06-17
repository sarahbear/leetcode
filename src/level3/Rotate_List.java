package level3;

import common.ListNode;

public class Rotate_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null)
			return head;
		int len = 0;
		ListNode node = head;
		for (; node != null; node = node.next)
			len++;
		n = n % len;
		ListNode fast = head;
		for (int i = 0; i < n && fast != null; i++) {
			fast = fast.next;
		}
		if (fast == null)
			return head;
		ListNode slow = head;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = head;
		head = slow.next;
		slow.next = null;
		return head;
	}
}
