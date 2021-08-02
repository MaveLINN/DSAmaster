/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* res ;
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        Preorder(original,cloned,target);
        return res ;
    }
    
    void Preorder(TreeNode* orig , TreeNode* cloned , TreeNode* target){
        if(orig != NULL){
            if(orig == target) res = cloned ;
            Preorder(orig->left,cloned->left,target);
            Preorder(orig->right,cloned->right,target);
        }
    }
};
