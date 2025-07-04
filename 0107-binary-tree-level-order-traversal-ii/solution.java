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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        if(root == null) return res ;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){
            TreeNode nod = q.poll();

            if(nod == null){

                    res.add(0,new ArrayList<>(l));
                    l.clear();
                                    if(!q.isEmpty()){
                    q.offer(null);
                }else break;
            }
            else{
                l.add(nod.val);
                if(nod.left != null)q.offer(nod.left);
                if(nod.right != null)q.offer(nod.right);
            }

        }

        return res ;
    }
}
