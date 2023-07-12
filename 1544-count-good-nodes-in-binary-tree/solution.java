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

    int res = 0 ;
    public int goodNodes(TreeNode root) {
        if(root != null){
            int mx = root.val ;
            check(root,mx);
        }
        return res ;
    }

    public void check(TreeNode root , int mx ){  
        if(root != null){
            if(root.val >= mx){ res++; mx = root.val ; }
            check(root.left,mx);
            check(root.right,mx);
        }
    }
}
