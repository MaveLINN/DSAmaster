class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        
        int n = accounts.size() , res = 0 ;
        for(int i = 0 ; i < n ; i++){
            res = max(res,accumulate(accounts[i].begin(),accounts[i].end(),0));
        }
        return res ;
    }
};
