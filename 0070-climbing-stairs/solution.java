class Solution {
    int[] dp = new int[50];
    public int climbStairs(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0 ;
        if(dp[n] != 0) return dp[n];
        int x = climbStairs(n-1);
        int xx = climbStairs(n-2);
        return dp[n] = x + xx ;
    }
}
