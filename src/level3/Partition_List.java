package level3;

import common.ListNode;

public class Partition_List {

	public static void main(String[] args) {

	}

	ListNode partition(ListNode head, int x) {
		ListNode lessHead = new ListNode(0);
		ListNode greatHead = new ListNode(0);
		ListNode lessNode = lessHead;
		ListNode greatNode = greatHead;
		ListNode node = head;
		while (node != null) {
			if (node.val < x) {
				lessNode.next = node;
				lessNode = node;
			} else {
				greatNode.next = node;
				greatNode = node;
			}
			node = node.next;
		}
		lessNode.next = greatHead.next;
		greatNode.next = null;
		return lessHead.next;
	}
}
