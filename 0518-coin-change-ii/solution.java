class Solution {
    int[][] dp = new int[301][5001];
    public int change(int amount, int[] coins) {
        for(int i = 0 ; i < 301 ; i++){
            for(int j = 0 ; j < 5001 ; j++){
                dp[i][j] = -1 ;
            }
        }
     return solve(coins,coins.length - 1,0,amount);   
    }

    int solve(int[] a , int n , int i , int target){
        if(target == 0) return 1 ;
        if(target < 0 || i > n) return 0 ;
        if(dp[i][target] != -1 ) return dp[i][target] ;
        return dp[i][target] = solve(a,n,i,target - a[i]) + solve(a,n,i+1,target) ;
    }
}
