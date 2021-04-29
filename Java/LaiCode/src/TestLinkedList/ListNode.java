package TestLinkedList;

public class ListNode {
	public int value;

	public ListNode(int v) {
		value = v;
	}

	public ListNode next;
	public static ListNode convertToLinkedList(int[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++) {
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}
		return head;
	}

	public static void printLinkedList(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.value + " -> ");
			cur = cur.next;
		}
		System.out.println("Null");
	}
}
