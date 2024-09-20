class Solution {
    int[][] dp = new int[10007][15] ;
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ;
        for(int i = 0 ; i < 10007 ; i++){
            for(int j = 0 ; j < 15 ; j++){
                dp[i][j] = -1;
            }
        }
        int res = solve(coins,0,amount,n-1) ;
        return res >= 123456 ? -1 : res;
    }

    public int solve(int[] a , int idx , int target , int size){
        if(target == 0) return 0;
        if(target < 0 || idx > size) return 123456 ;

        if(dp[target][idx] != -1) return dp[target][idx] ;
        return dp[target][idx] = Math.min( 1 + solve(a,idx,target - a[idx],size) , solve(a,idx+1,target,size));
    }
}
