package LinkedList;
// Time O(n)
// Space O(1)
public class Q34_ReverseLinkedList_iterative {
	public ListNode reverse(ListNode head) {
		//corner case 被天然handle了
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
