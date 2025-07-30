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

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return res ;
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp == null){
                res.add(new ArrayList<>(list));
                list.clear();
                if(q.isEmpty()){
                    break;
                }else{
                   q.offer(null);
                }

            }else{
                list.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }


        }
        return res ;
    }
}
