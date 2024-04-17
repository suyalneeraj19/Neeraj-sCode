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
    public String smallestFromLeaf(TreeNode root) {
        StringBuffer sb=new StringBuffer();
        helper(root,new StringBuffer(),sb);
        return sb.toString();
    }
    
    public static void helper(TreeNode node,StringBuffer path,StringBuffer sb){
        if(node==null)  return;
        
        path.append((char)('a'+node.val));
        
        if(node.left==null && node.right==null){
            String currString=path.reverse().toString();
            
            if(sb.length()==0 || currString.compareTo(sb.toString())<0){
                sb.setLength(0);
                sb.append(currString);
            }
            path.reverse();
        }
        
        helper(node.left,path,sb);
        helper(node.right,path,sb);
        
        path.setLength(path.length()-1);
    }
}