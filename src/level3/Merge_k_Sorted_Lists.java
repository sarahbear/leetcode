package level3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

		public String toString() {
			return val + "";
		}
	}

	public static void main(String[] args) {
		ArrayList<ListNode> lists = new ArrayList<ListNode>();
		ListNode head = new ListNode(0);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(5);
		head.next = n1;
		n1.next = n2;
		lists.add(head);
		ListNode node = mergeKLists(lists);
		System.out.println(node.val);
	}

	public static ListNode mergeKLists(ArrayList<ListNode> lists) {
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(10,new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val-o2.val;
			}
		});

		for (ListNode node : lists)
			if (node != null)
				q.offer(node);

		ListNode head = new ListNode(0);
		ListNode node = head;
		while (!q.isEmpty()) {
			ListNode top = q.poll();
			node.next = top;
			node = top;
			if (top.next != null)
				q.offer(top.next);
		}
		return head.next;
	}
}
