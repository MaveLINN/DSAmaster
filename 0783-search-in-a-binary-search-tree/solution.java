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
    public TreeNode searchBST(TreeNode root, int val) {
        return solve(root,val);
    }

    public TreeNode solve(TreeNode r, int v){
        if(r == null) return null ;
        if(r.val == v ) return r ;

        return v > r.val ? solve(r.right,v) : solve(r.left,v) ;
    }
}
