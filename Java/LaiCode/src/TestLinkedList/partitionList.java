package TestLinkedList;

public class partitionList {
	public ListNode partition(ListNode head, int target) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode smallDummy = new ListNode(0), largeDummy = new ListNode(0);
		ListNode a = smallDummy, b = largeDummy, c = head;
		while (c != null) {
			if (c.value < target) {
				a.next = c;
				a = a.next;
			} else {
				b.next = c;
				b = b.next;
			}
			c = c.next;
		}
		a.next = largeDummy.next;
		b.next = null;
		return smallDummy.next;
	}

}
