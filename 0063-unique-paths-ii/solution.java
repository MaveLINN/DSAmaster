class Solution {
    int[][] dp ;
    public int uniquePathsWithObstacles(int[][] a) {
    
        int n = a.length ;
        int m = a[0].length ;
        dp = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                dp[i][j] = -1 ;
            }
        }
        return solve(a,n-1,m-1);
    }

    public int solve(int[][] a , int i , int j){
        if(i < 0 || j < 0 || a[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1 ;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(a,i,j-1) + solve(a,i-1,j);

    }
}
