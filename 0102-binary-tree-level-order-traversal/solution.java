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
    public List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(node == null) return list;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(node);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            List<Integer> l = new LinkedList<Integer>() ;
            
            for(int i = 0 ; i < n ; i++){
            TreeNode k = q.peek(); q.poll();
            l.add(k.val);
            if(k.left != null)q.offer(k.left);
            if(k.right != null)q.offer(k.right);
            }
            list.add(l);
        }
        return list;
    }
}
