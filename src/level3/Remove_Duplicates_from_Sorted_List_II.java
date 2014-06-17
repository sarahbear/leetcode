package level3;

import common.ListNode;

public class Remove_Duplicates_from_Sorted_List_II {

	ListNode creatLinkedList(int[] a) {
		ListNode head = null;
		for (int i = a.length - 1; i >= 0; i--) {
			ListNode node = new ListNode(a[i]);
			node.next = head;
			head = node;
		}
		return head;
	}

	void print(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3 };
		Remove_Duplicates_from_Sorted_List_II creator = new Remove_Duplicates_from_Sorted_List_II();
		ListNode head1 = creator.creatLinkedList(a1);

		ListNode head = creator.deleteDuplicates(head1);
		creator.print(head);
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = new ListNode(Integer.MAX_VALUE);
		p.next = head;
		head = p;
		ListNode q = head.next;
		ListNode r = q.next;
		if (q.val != r.val)
			p = p.next;
		while (r.next != null) {
			if (r.val == r.next.val || q.val == r.val) {
				q = q.next;
				r = r.next;
			} else {
				q = q.next;
				r = r.next;
				p.next = q;
				p = p.next;
			}
		}
		if (q.val != r.val)
			p.next = r;
		else
			p.next = null;
		return head.next;
	}
}