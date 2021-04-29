package LinkedList;

public class Q39_InsertInSortedLinkedList {
	public ListNode insert(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null || value < head.value) {
			newNode.next = head;
			return newNode;
		}
		ListNode p = head;
		while (p.next != null && p.next.value < value) {
			p = p.next;
		}
		newNode.next = p.next;
		p.next = newNode;
		return head;
	}
}
