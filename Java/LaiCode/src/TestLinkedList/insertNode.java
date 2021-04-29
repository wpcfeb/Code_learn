package TestLinkedList;

public class insertNode {
	public ListNode insert(ListNode head, int target) {
		ListNode newNode = new ListNode(target);
		if (head == null || target < head.value) {
			newNode.next = head;
			return newNode;
		}
		ListNode p = head;
		while (p.next != null && p.next.value < target) {
			p = p.next;
		}
		newNode.next = p.next;
		p.next = newNode;
		return head;

	}
}
