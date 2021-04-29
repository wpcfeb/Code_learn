package LinkedList;

public class Q36_MiddleNodeOfLinkedList {
	public ListNode middleNode(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
