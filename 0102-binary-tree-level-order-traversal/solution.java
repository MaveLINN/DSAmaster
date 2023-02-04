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

        List< List<Integer> > list = new ArrayList< List<Integer> >();

        if(root == null)
        return list ;

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q.offer(root); // initial push in queue
        q.offer(null); // this null will tell to add the list to list Of list .. like  3 N 9 20 N 15 7 N 

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node == null){ // it means to change the new line 
                list.add(new ArrayList(ans)); // adding the existing list to result .
                ans.clear(); 
                                  
                if(q.isEmpty()) // if empty means there is no node after that .
                    break ;
                else q.offer(null); // if value exist after null , then we need to insert the null again   
            }
            else{
                ans.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }

        }
        return list ;
    }
}
