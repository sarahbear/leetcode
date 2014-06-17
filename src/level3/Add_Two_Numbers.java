package level3;

import common.ListNode;

public class Add_Two_Numbers {

	public static void main(String[] args) {
		ListNode l1 =new ListNode(3);
		l1.next = new ListNode(7);
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(2);
		ListNode head = new Add_Two_Numbers().addTwoNumbers(l1, l2);
		System.out.println(head.next.val);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode node = head;
		int carry = 0;
		while (l1 != null && l2 != null) {
			node.next = new ListNode((carry + l1.val + l2.val) % 10);
			carry = (carry+ l1.val + l2.val) / 10;
			node = node.next;
			l1=l1.next;
			l2=l2.next;
		}
		while (l1 != null) {
			node.next = new ListNode((carry + l1.val) % 10);
			carry = (carry + l1.val) / 10;
			node = node.next;
			l1=l1.next;
		}
		while (l2 != null) {
			node.next = new ListNode((carry + l2.val) % 10);
			carry = (carry + l2.val) / 10;
			node = node.next;
			l2=l2.next;
		}
		if (carry > 0)
			node.next = new ListNode(carry);
		return head.next;
	}
}
