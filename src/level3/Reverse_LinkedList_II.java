package level3;

import common.ListNode;

public class Reverse_LinkedList_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode newHead = new ListNode(0);
		newHead.next = head;

		ListNode pre = newHead;
		ListNode preM = newHead;// preM 第m-1个节点
		for (int i = 1; i <= n; i++) {
			if (i == m)
				preM = pre;
			if (i > m && i <= n) {
				// 删除head节点
				pre.next = head.next;
				head.next = preM.next;
				// 尾插法
				preM.next = head;
				head = pre;
			}
			pre = head;
			head = head.next;
		}
		return newHead.next;
	}
}
