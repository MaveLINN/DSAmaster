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

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<>();

        if(root == null)
        return list ;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                list.add(0,new ArrayList(ans)); // It is same as level order Traversal , but here adding the list from front . That's it .
                ans.clear();

                if(q.isEmpty())
                    break;
                else q.offer(null);
            }
            else{
                ans.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return list ;
    }
}
