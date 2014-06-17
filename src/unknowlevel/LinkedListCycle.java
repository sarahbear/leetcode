package unknowlevel;
public class LinkedListCycle {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null ) {// only check fast
			fast = fast.next.next;
			slow = slow.next;
			if (fast==slow) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
	//	ListNode node3 = new ListNode(3);

		node1.next = node2;
		node2.next = null;
		
		//node3.next = null;
		System.out.println(hasCycle(node1));
	}
}
