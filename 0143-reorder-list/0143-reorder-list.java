/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) {
        	return;
        }
        
        ListNode mid=getmid(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        
        while(hf!=null && hs!=null) {
        	ListNode temp=hf.next;
        	hf.next=hs;
        	hf=temp;
        	
        	temp=hs.next;
        	hs.next=hf;
        	hs=temp;
        }
        
    }
	
	public ListNode getmid(ListNode head) {
	    if (head == null || head.next == null) {
	        return head;
	    }
	    ListNode slow = head, fast = head.next;
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    ListNode mid = slow.next;
	    slow.next = null;
	    return mid;
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }
	    return prev;
	}
}