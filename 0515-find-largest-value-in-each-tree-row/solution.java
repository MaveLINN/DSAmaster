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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root != null){
            Queue<TreeNode> q = new LinkedList<TreeNode>();

            q.offer(root);
            q.offer(null);
            int maxValue = Integer.MIN_VALUE ;

            while(q.size() > 0){
                TreeNode check = q.poll();
                if(check == null){
                    res.add(maxValue) ;
                    maxValue = Integer.MIN_VALUE ;
                    if(q.size() == 0) break;
                    else q.offer(null);
                }
                else{
                    maxValue = Math.max(maxValue,check.val);
                    if(check.left != null) q.offer(check.left);
                    if(check.right != null) q.offer(check.right);
                }

            }
        }   
        return res ;
    }
}
