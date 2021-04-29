package LinkedList;

public class Q306_CheckIfLinkedListIsPalindrome {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode middle = findMiddle(head);
		ListNode right = reverseLinkedList(middle.next);
		while (right != null) {
			if (head.value != right.value) {
				return false;
			}
			head = head.next;
			right = right.next;
		}
		return true;
	}
	
	private ListNode findMiddle(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	private ListNode reverseLinkedList(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode nxt = head.next;
			head.next = pre;
			pre = head;
			head = nxt;
		}
		return pre;
	}
	
}
