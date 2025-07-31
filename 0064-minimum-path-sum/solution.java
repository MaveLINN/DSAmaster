class Solution {
    int[][] dp;
    public int minPathSum(int[][] a) {
        int n = a.length ;
        int m = a[0].length ;
        dp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                dp[i][j] = Integer.MAX_VALUE ;
            }
        }
        return solve(a,n-1,m-1);
    }

    public int solve(int[][] a , int i , int j ){
        if(i < 0 || j < 0 ) return Integer.MAX_VALUE - 1 ;
        if(i == 0 && j == 0) return a[i][j];

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
        return dp[i][j] = a[i][j] + Math.min(solve(a,i,j-1) , solve(a,i-1,j) );
    }
}
