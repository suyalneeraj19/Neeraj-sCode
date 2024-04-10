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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<>();
        
        if(root==null)  return res;
        
        Deque<TreeNode> que=new LinkedList<>();
        
        que.add(root);
        
        boolean rev=false;
        
        while(!que.isEmpty()){
            int lvlSize=que.size();
            List<Integer> currLvl=new ArrayList<>();
            for(int i=0;i<lvlSize;i++){
                if(!rev){
                    TreeNode currNode=que.pollFirst();
                    currLvl.add(currNode.val);
                    if(currNode.left!=null) que.offerLast(currNode.left);
                    if(currNode.right!=null)    que.offerLast(currNode.right);
                }else{
                    TreeNode currNode=que.pollLast();
                    currLvl.add(currNode.val);
                    if(currNode.right!=null) que.offerFirst(currNode.right);
                    if(currNode.left!=null) que.offerFirst(currNode.left);
                }
            }
            rev=!rev;
            res.add(currLvl);
        }
        return res;
    }
}