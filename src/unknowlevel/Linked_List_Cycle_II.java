package unknowlevel;

import common.ListNode;

public class Linked_List_Cycle_II {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n2;
		System.out.println(detectCycle(head).val);
	}

	public static ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				while (fast != head) {// ?????
					fast = fast.next;
					head = head.next;
				}
				return fast;
			}
		}
		return null;
	}
}
