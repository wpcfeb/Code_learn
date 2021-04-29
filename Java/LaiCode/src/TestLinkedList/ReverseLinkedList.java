package TestLinkedList;

public class ReverseLinkedList {

	public static ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null, cur = head, nxt = head.next;
		while (cur != null) {
			nxt = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nxt;
		}

		return pre;
	}
	
	public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        
        ListNode current_node = head;
         for (int i = 1; i < m; i++) {
             prev = prev.next;
             current_node = prev.next;
         }
         ListNode connectionNode = prev;
         ListNode nxt = current_node.next;
         for (int i = m; i <= n; i++) {
             nxt = current_node.next;
             current_node.next = prev;
             prev = current_node;
             current_node = nxt;
         }
         //post processing
         connectionNode.next.next = current_node;
         connectionNode.next = prev;
         return head;
}
	public static void main(String[] args) {
		
		int[] array = {3, 5, 7,9};
		
		ListNode head = ListNode.convertToLinkedList(array);
//		ListNode newHead = reverse(head);
//		ListNode.printLinkedList(newHead);

		ListNode newHead = reverseBetween(head, 1, 3);//have bug!!!!!
		ListNode.printLinkedList(newHead);
	}

}
