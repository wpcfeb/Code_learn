package TestLinkedList;

public class FindTheMiddleNode {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4 ,5, 6, 7};
		ListNode head = ListNode.convertToLinkedList(array);
		ListNode.printLinkedList(head);
		ListNode MiddleNode = findMiddle(head);
		System.out.println(MiddleNode.value);
		
	}
	public static ListNode findMiddle(ListNode head){
		if(head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
