class Solution {
    int[][] dp = new int[10001][15];

    public int coinChange(int[] coins, int amount) {
        for(int i = 0 ; i < 10001 ; i++){
            for(int j = 0 ; j < 15 ; j++){
                dp[i][j] = -1 ;
            }
        }
        int val = solve(coins,amount,coins.length-1,0);
        return val >= 123456 ? -1 : val ;
    }

    public int solve(int[] a, int target , int n ,  int i){
        if(target == 0 ) return 0 ;
        if(i > n || target < 0 ) return 123456 ;
        if(dp[target][i] != -1) return dp[target][i] ;
        return dp[target][i] = Math.min( 1+solve(a,target - a[i],n,i) , solve(a,target,n,i+1) );
    }
}
