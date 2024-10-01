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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private TreeNode helper(ArrayList<Integer> arr, int s, int e) {
        if (s > e)
            return null;
        int mid = s + (e - s) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = helper(arr, s, mid - 1);
        root.right = helper(arr, mid + 1, e);
        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int i = 0, e = arr.size() - 1;
        TreeNode root = helper(arr, 0, e);
        return root;
    }
}