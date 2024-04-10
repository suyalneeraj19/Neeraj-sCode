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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        
        if(root==null)  return res;
        
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            int lvlSize=que.size();
            List<Integer> currLvl=new ArrayList<>();
            for(int i=0;i<lvlSize;i++){
                TreeNode currNode=que.poll();
                currLvl.add(currNode.val);
                if(currNode.left!=null) que.offer(currNode.left);
                if(currNode.right!=null) que.offer(currNode.right);
            }
            res.add(0,currLvl);
        }
        return res;
    }
}