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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp=new ListNode(0,head);
        Set<Integer> delete=new HashSet<>();
        for(int x:nums){
            delete.add(x);
        }

        ListNode res=temp;
        while(res.next!=null){
            if(delete.contains(res.next.val)){
                res.next=res.next.next;
            }else{
                res=res.next;
            }
        }

        return temp.next;
    }
}