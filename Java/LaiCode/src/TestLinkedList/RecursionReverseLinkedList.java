package TestLinkedList;

public class RecursionReverseLinkedList {
	public static ListNode reverse2(ListNode head) {
		// basecase
		if (head == null || head.next == null) {
			return head;
		}

		// subproblem
		ListNode subHead = reverse2(head.next);
		// 1)
		ListNode t = head.next;
		t.next = head;
		// 2)
		head.next = null;
		// 3)
		return subHead;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		ListNode head = ListNode.convertToLinkedList(array);
		ListNode newHead = reverse2(head);
		ListNode.printLinkedList(newHead);
	}

}
