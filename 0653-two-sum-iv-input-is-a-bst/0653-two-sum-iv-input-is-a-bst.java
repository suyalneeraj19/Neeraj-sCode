/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        // Brute Force Approach

        List<Integer> list = new ArrayList<>();
        helper(root,list);

        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < list.size(); i++){

            int compliment = k - list.get(i);

            if(map.containsKey(compliment))    return true;

            map.put(list.get(i), i);
        }

        return false;
    }


    static void helper(TreeNode node, List<Integer> list){
        if(node == null)    return;

        list.add(node.val);
        helper(node.left, list);
        helper(node.right, list);
    }
}