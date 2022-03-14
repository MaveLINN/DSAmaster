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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(root == null) return list ;
        Stack<TreeNode> s = new Stack<TreeNode>() ;
        s.push(root);
        
        while(!s.isEmpty()){
            
            TreeNode k = s.peek();s.pop();
            list.add(k.val);
            if(k.right != null)s.push(k.right);
            if(k.left != null)s.push(k.left);
            
        }
        
        return list ;
    }
}
