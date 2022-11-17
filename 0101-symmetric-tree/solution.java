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
    public boolean isSymmetric(TreeNode root) {
        return root == null || solve(root.left , root.right); // if root null it means symmetric and call for other nodes
    }


    public boolean solve(TreeNode left , TreeNode right){
        if(left == null || right == null){ // if left/right equals then we'll check if both are null means symmetric and we are returning true else false .
            return left == right ;
        }

        if(left.val != right.val) return false ; // if we reach to non null value , then we  need to compare the value if value is not same then return false , else if it is same then call for the next nodes . 

// each time we need to check for Left ( left node ) == Right ( right node ) and Left ( right node ) == Right( left node)
        return solve(left.left , right.right) && solve(left.right , right.left) ;

    }
}
