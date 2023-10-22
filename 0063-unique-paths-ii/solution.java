class Solution {
    int[][] dp = new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length ;
        int m = obstacleGrid[0].length ;
        
        for(int i = 0 ; i < 101 ; i++){
            for(int j = 0 ; j < 101 ; j++){
                dp[i][j] = -1 ;
            }
        }
        return solve(obstacleGrid,n-1,m-1);
    }

    int solve(int[][] a , int n , int m ){

            if(m < 0 || n < 0 || a[n][m] == 1 ) return 0;
            if( n == 0 && m == 0) return 1 ;
            if(dp[n][m] != -1 ) return dp[n][m] ; 
            return dp[n][m] = solve(a,n,m-1) + solve(a,n-1,m);
    }
}
