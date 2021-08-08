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
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        const int n = nums.size();
        TreeNode* root = insertNode(nums , 0 , n-1);
        return root ;
    }
    
    TreeNode* insertNode(vector<int>& nums , int i , int j ){
        if(i > j) return NULL ;
        if(i == j) return new TreeNode(nums[i]) ;

        int idx = findMax(nums,i,j);
        TreeNode* head = new TreeNode(nums[idx]) ;
        
        head->left = insertNode(nums , i , idx - 1);
        head->right = insertNode(nums , idx + 1 , j);
        
        return head ;
    }
    
    int findMax(vector<int>& nums , int i , int j){
        int check = INT_MIN , res = -1 ;
        for(int x = i ; x <= j ; x++){
            if(nums[x] > check ){
                check = nums[x];
                res = x ;
            }
        }  
        //cout << res ; 
        return res ;
    }
};
