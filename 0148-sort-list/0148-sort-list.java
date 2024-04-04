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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
	        return list2;
	    }
	    if (list2 == null) {
	        return list1;
	    }
	    if (list1.val < list2.val) {
	        list1.next = merge(list1.next, list2);
	        return list1;
	    } 
	        list2.next = merge(list1, list2.next);
	        return list2;
    }

    ListNode getMid(ListNode head) {
        if(head==null|| head.next==null){
            return head;
        }
        ListNode f=head.next,s=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode mid = s.next;
	    s.next = null;
	    return mid;
    }


}