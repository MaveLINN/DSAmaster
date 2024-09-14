class Solution {
    int[] dp = new int[50];
    public int fib(int n) {
        if(n < 2) return n ;

        if(dp[n] != 0) return dp[n];
        int x = fib(n-1);
        int y = fib(n-2);
        return dp[n] = x + y ;
    }
}
