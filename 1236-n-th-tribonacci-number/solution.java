class Solution {
    int[] dp = new int[40];
    public int tribonacci(int n) {
        for(int i = 0 ; i < 40 ; i++){
            dp[i] = -1 ;
        }
        dp[0] = 0 ; dp[1] = 1 ; dp[2] = 1 ;
        return solve(n);
    }


    public int solve(int n){
        if(n < 0) return 0 ;
        if(dp[n] != -1) return dp[n];
        return dp[n] = solve(n-1) + solve(n-2) + solve(n-3) ;
    }
}
