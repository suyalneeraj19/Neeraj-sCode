class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        
        return dfs(root);
    }
    
    private boolean dfs(TreeNode node) {
        if (node == null) {
            return false;
        }
        
        if (node.val == 1) {
            return true;
        } else if (node.val == 2) {
            return dfs(node.left) || dfs(node.right);
        } else if (node.val == 3) {
            return dfs(node.left) && dfs(node.right);
        }
        
        return false;
    }
}