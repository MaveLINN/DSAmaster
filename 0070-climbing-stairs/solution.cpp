class Solution {
public:
    int dp[100];
    int climbStairs(int n) {
        
        if(n < 3)return n;
        if(dp[n] != 0)return dp[n];
        
        int x = climbStairs(n-1);
        int y = climbStairs(n-2);
        
        return dp[n] = x + y ;
        
    }
};
