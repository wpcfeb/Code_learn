package LinkedList;

public class Q41_ReOrderLinkedList {
	public ListNode reorder(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		//1. find the middle node
		ListNode mid = middleNode(head);
		ListNode one = head;
		ListNode two = mid.next;
		// de-link the second half from the list.
		mid.next = null;
		//2. reverse the second half
		//3. merge the two halves
		return merge(one, reverse(two));
		
	}
	private ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	private ListNode reverse(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode nxt = head.next;
			head.next = pre;
			pre = head;
			head = nxt;
		}
		return pre;
	}
	private ListNode merge(ListNode one, ListNode two) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while (one != null && two != null) {
			cur.next = one;
			one = one.next;
			cur.next.next = two;
			two = two.next;
			cur = cur.next.next;
		}
		if (one != null) {
			cur.next = one;
		} else {
			cur.next = two;
		}
		return dummy.next;
	}
}

