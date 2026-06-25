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
        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        q.add(root);

        while(!q.isEmpty()){
            int levelLength = q.size();
            List<Integer> n = new ArrayList<>();
            for(int i = 0; i < levelLength; i++){
                TreeNode cur = q.poll();
                n.add(cur.val);
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
            l.add(n);
        }
        return l;
    }
}
