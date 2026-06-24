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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return (Math.abs(height(root.left) - height(root.right)) <= 1) && isBalanced(root.right) && isBalanced(root.left);
    }

    public int height(TreeNode root){
        if(root == null) return 0;

        int left =  1 + height(root.left);
        int right = 1 + height(root.right);
        
        return Math.max(left, right);
    }
}
