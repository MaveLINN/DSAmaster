/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode o, final TreeNode c, final TreeNode t) {
        return solve(o,c,t);
    }

    public final TreeNode solve(final TreeNode o, final TreeNode c, final TreeNode t){
        if(o == null || c == null) return null ;
        if(o == t) return c ;
        TreeNode x = solve(o.left,c.left,t);
        TreeNode y = solve(o.right,c.right,t);

        if(x != null) return x ;
        if(y != null) return y ;
        return null ;
    }
}
