package TestLinkedList;

public class mergeTwoSortedLinkedList {
	public ListNode merge(ListNode h1, ListNode h2) {
		ListNode dummyHead = new ListNode(0);
		ListNode a = h1, b = h2, c = dummyHead;
		while (a != null && b != null) {
			if (a.value < b.value) {
				c.next = a;
				a = a.next;
			} else {
				c.next = b;
				b = b.next;
			}
			c = c.next;
			if (a != null) {
				c.next = a;
			} else if (b != null) {
				c.next = b;
			}
		}
		return dummyHead.next;
	}

}
