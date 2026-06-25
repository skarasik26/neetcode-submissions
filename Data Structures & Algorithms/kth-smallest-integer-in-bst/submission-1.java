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
    int count = 0;
    int val;
    public int kthSmallest(TreeNode root, int k) {
        in(root, k);
        return val;
    }
    public void in(TreeNode root, int k){
        if(root == null) return;
        in(root.left, k);
        count++;
        if(count == k) val = root.val;
        in(root.right, k);
    }

}
