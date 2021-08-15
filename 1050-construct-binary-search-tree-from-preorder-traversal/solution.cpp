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
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        
        TreeNode* root = NULL ;
        for(auto &i : preorder)
            root = addNode(root , i);
        
        return root ;
    }
    
    TreeNode* addNode(TreeNode* root , int value){
        if(root == NULL) return root = new TreeNode(value);
        
        if(root->val > value)
            root->left = addNode(root->left , value);
        else root->right = addNode(root->right , value);
        
        return root ;
    }
};
