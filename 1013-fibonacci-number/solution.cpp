class Solution {
public:
    int dp[50];
    int fib(int n) {
        
        if(n == 1 || n == 2) return 1 ;
        
        if(n < 1)return 0 ;
        
        if(dp[n] != 0) return dp[n];
        
        int x = fib( n - 1) ;
        int y = fib( n - 2) ;
        
        return dp[n] = x + y ;
        
    }
};
