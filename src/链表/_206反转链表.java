package 链表;

public class _206反转链表 {

	public ListNode reverseList(ListNode head) {
		
		if(head == null || head.next == null ) return head;
		
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
}
