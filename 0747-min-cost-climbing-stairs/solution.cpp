class Solution {
public:
    
    int dp[1001];
    int minCostClimbingStairs(vector<int>& cost) {
      //  memset( dp , -1 , sizeof dp);
        const int n = cost.size() ;
        return min (go(cost , n - 1) , go(cost , n -2 ) ) ;
    }
    
    int go(vector<int > v , int idx){
        
        if(idx < 0) return 0 ;
        
        if(idx == 0 || idx == 1) return v[idx] ;
        if(dp[idx] != 0) return dp[idx] ;
        
        return dp[idx] = v[idx] + min( go(v,idx-1) , go(v,idx-2)) ;
    }
};
