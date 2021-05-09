class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        const int n = accounts.size();
        const int m = accounts[0].size();
        int res = 0 ;
        
        
        for(int i = 0 ; i < n ; i++){
            res = max(res , accumulate(accounts[i].begin() , accounts[i].end(),0));
        }
        
        return res ;
    }
};
