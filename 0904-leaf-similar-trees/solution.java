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
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafNode(root1,1);
        leafNode(root2,2);
        if(l1.size() != l2.size()) return false ;
        for(int i = 0 ; i < l1.size() ; i++){
            if(l1.get(i) != l2.get(i)) return false;
        }

        return true ;
    }

    public void leafNode(TreeNode root , int x ){
        if(root != null){
        if(root.left == null && root.right == null){
            if(x==1)l1.add(root.val);
            else l2.add(root.val);
        } 
        leafNode(root.left,x);
        leafNode(root.right,x);
        }
    }
}
