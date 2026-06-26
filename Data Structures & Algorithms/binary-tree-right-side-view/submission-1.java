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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null) return l;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            l.add(q.peek().val);
            for(int i = 0; i < size; i++){
                TreeNode cur = q.poll();
                if(cur.right != null){
                    q.add(cur.right);
                }
                if(cur.left != null){
                    q.add(cur.left);
                }
                
            }
            
        }
        return l;
    }
}
