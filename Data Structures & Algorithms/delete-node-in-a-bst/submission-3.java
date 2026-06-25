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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(key > root.val) root.right = deleteNode(root.right, key);
        else if(key < root.val) root.left = deleteNode(root.left, key);
        else{
            if(root.right == null) root = root.left;
            else if(root.left == null) root = root.right;
            else{
                TreeNode min = root.right;
                while(min.left != null) min = min.left;
                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
            }
        }
        return root;
    }
}