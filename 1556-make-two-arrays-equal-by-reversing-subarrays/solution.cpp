class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        const int n = target.size();
        
        int dp[1001] ;
        memset(dp , 0 , sizeof dp);
        
        for(int i = 0 ; i < n ; i++){
            dp[target[i]]++;
            dp[arr[i]]--;
        }
        
        for(int i = 1 ; i < 1001 ; i++){
            if(dp[i] != 0)return false;
        }
        
        return true;
    }
};
