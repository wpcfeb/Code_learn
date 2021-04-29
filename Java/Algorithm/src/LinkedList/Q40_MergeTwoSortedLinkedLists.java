package LinkedList;

public class Q40_MergeTwoSortedLinkedLists {
	public ListNode merge(ListNode one, ListNode two) {
		ListNode dummyHead = new ListNode(-1);
		ListNode cur = dummyHead;
		while (one != null && two != null) {
			if (one.value < two.value) {
				cur.next = one;
				one = one.next;
			} else {
				cur.next = two;
				two = two.next;
			}
			cur = cur.next;
		}
		//link the remaining possible nodes
		if (one != null) {
			cur.next = one;
		} else {
			cur.next = two;
		}
		return dummyHead.next;
	}
}
