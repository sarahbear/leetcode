package level2;

public class Remove_Nth_Node_From_End_of_List {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		ListNode n = removeNthFromEnd(a, 4);
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node = head;
		ListNode end = head;
		while (n > 0) {
			end = end.next;
			n--;
		}
		if (end == null) {// remove first
			head = head.next;
			return head;
		}
		while (end.next != null) {
			node = node.next;
			end = end.next;
		}
		node.next = node.next.next;
		return head;
	}
}
