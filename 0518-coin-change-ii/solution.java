class Solution {

    int[][] dp = new int[5005][303];
    public int change(int amount, int[] coins) {
        for(int i  = 0 ; i < 5005 ; i++){
            for(int j = 0 ; j < 303 ; j++){
                dp[i][j] = -1 ;
            }
        }
        return solve(amount,coins,0);        
    }

    public int solve(int amount , int[] coins , int i ){
        if(amount == 0) return 1 ;
        if(i >= coins.length || amount < 0 ) return 0 ;
        if(dp[amount][i] != -1) return dp[amount][i] ;
        return dp[amount][i] = solve(amount-coins[i],coins,i) + solve(amount,coins,i+1); 
    }
}
