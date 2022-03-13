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
    vector<vector<int>> levelOrder(TreeNode* root) {
         vector<vector<int>> v ;
    if(root == NULL) return v; 
    queue<TreeNode*> q ; 
    q.push(root);

    while(!q.empty()){
      std::vector<int> u;
      int n = q.size();

      for(int i = 0 ; i < n ; i++){
      TreeNode* k = q.front() ; q.pop();
      u.push_back(k->val);

      if(k->left != NULL)q.push(k->left);
      if(k->right != NULL)q.push(k->right);
      }
      v.push_back(u);
    }
    return v ;
    }
};
