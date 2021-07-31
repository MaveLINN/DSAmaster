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
    int depth = 0 ;
    int deepestLeavesSum(TreeNode* root) {
      //  int depth = maxDepth(root);
        check(root , 1);
        return res ;
    }
    
    // int maxDepth(TreeNode* root){
    //     if(root == NULL) return 0 ;
    //     return 1 + max( maxDepth(root->left) , maxDepth(root->right) ) ;
    // }
    
    void check(TreeNode* root , int curr){
       if(root){ 
        if(curr > depth){
            res = 0 ; 
            depth = curr ;
        }
        cout << res << " " ;
        if(curr == depth) res += root->val ;  
        check(root->left , curr + 1) ;
        check(root->right , curr + 1);
       }
    }
    

};
