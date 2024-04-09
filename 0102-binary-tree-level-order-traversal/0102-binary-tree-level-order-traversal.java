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
     public List<List<Integer>> levelOrder(TreeNode root) {
		// create the base for returning the answer
        List<List<Integer>> res=new ArrayList<>();

        // if the root node is empty return the empty list as answer
        if(root==null){
            return res;
        }

        // Make a queue but it should have the properties of Linked List
        Queue<TreeNode> que=new LinkedList<>();
        // offer the root node to the que
        que.offer(root);

        // while we don't reach the end of the TreeNode keep iterating
        while(!que.isEmpty()){
            // maintain the levelsize of each level
            int lvlSize=que.size();
            // make a current level list to store the visted elemnts of current level
            List<Integer> currentLevel=new ArrayList<>();

            for(int i=0;i<lvlSize;i++){
                // poll the starting elemnt of the que
                TreeNode currentNode = que.poll();
                // add the current Level's Nodes
                currentLevel.add(currentNode.val);

                // if left node is not empty then  offer the left node 
                if(currentNode.left!=null){
                    que.offer(currentNode.left);
                }
                // if right node is not empty then  offer the right node 
                if(currentNode.right!=null){
                    que.offer(currentNode.right);
                }
            }
            // add the current level into the final result list
            res.add(currentLevel);
        }

        // return the final list
        return res;
	    }
}