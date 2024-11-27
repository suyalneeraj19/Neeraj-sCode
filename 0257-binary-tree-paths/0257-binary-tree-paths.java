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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        helper(root, new StringBuffer(), path);
        return path;
    }

    static void helper(TreeNode node, StringBuffer path, List<String> paths) {
        if (node == null) {
            return;
        }

        int len = path.length();
        path.append(node.val);

        // If it's a leaf node, add the path to the result
        if (node.left == null && node.right == null) {
            paths.add(path.toString());
        } else {
            // Add "->" for non-leaf nodes
            path.append("->");
            // Recur for left and right children
            helper(node.left, path, paths);
            helper(node.right, path, paths);
        }

        // Backtrack: remove the current node's value and "->" if present
        path.setLength(len); 
    }
}