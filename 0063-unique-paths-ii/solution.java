class Solution {
    int[][] dp = new int[101][101] ;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        if(n == 0) return 0 ;
        int m = obstacleGrid[0].length;

        for(int i = 0 ; i < 101 ; i++){
            for(int j = 0 ; j < 101 ; j++){
                dp[i][j] = -1 ;
            }
        }
        return solve(obstacleGrid,0,0,n - 1,m - 1);
    }

    public int solve(int[][] a , int i , int j , int n , int m){
        if(i > n || j > m || a[i][j] == 1) return 0 ;
        if(i == n && j == m) return 1 ;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(a,i+1,j,n,m) + solve(a,i,j+1,n,m);
    }
}
