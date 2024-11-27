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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFrequency;
        
        maxFrequency = helper(root,map);

        int [] ans = findMode(map,maxFrequency);

        return ans;
    }

    static int helper(TreeNode node, HashMap<Integer,Integer> map){
        if(node == null){
            return 0;
        }

        int count = map.getOrDefault(node.val,0)+1;
        map.put(node.val, count);

        int left = helper(node.left,map);
        int right = helper(node.right,map);

        return Math.max(count,Math.max(left,right));
    }

    static int [] findMode(HashMap<Integer,Integer> map, int max){
        return map.entrySet().stream().filter(entry -> entry.getValue() == max).mapToInt(Map.Entry :: getKey).toArray();
    }
}