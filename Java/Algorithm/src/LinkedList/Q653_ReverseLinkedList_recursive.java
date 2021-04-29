package LinkedList;

//Time O(n)
//Space O(n)
public class Q653_ReverseLinkedList_recursive {
	public ListNode reverse(ListNode head) {
		//base case 
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
}
