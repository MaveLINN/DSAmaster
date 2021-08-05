/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int res = 0 ;
    int rangeSumBST(TreeNode* root, int low, int high) {
        check(root,low,high);
        return res;
    }
    
    void check(TreeNode* root , int low , int high){
        if(root != NULL){
        if(root->val >= low and root->val <= high)
            res += root->val ;
        
        check(root->left,low,high);
        check(root->right,low,high);
        }
    }
};
