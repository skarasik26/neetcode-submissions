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

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null){
                return deleteNode(root.right, key);
            }else if(root.right == null){
                return deleteNode(root.left, key);
            }else{
                TreeNode min = findMin(root.right);
                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
            }
        }
        return root;
    }
    public TreeNode findMin(TreeNode root){
        TreeNode min = root;
        while(min != null && min.left != null){
            min = min.left;
        }
        return min;
    }
}