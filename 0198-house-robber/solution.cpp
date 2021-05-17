class Solution {
public:
    int dp[101];
    int rob(vector<int>& nums) {
        memset(dp , -1 , sizeof dp);
        const int n = nums.size() ;
        return go(nums , n - 1);
    }
    
    int go(vector<int> v , int idx){
        
        if(idx < 0 )return 0 ;
       // if(idx < 1 ) return v[0] ;
        
        if( dp[idx] != -1) return dp[idx];
        
        int x = go(v, idx - 2) + v[idx] ;
        int y = go(v,idx -1 ) ;
        
        return dp[idx] = max(x,y);
        
    }
    
};
