class Solution {

    int[][] dp = new int[201][201] ;
    public int minPathSum(int[][] grid) {

        int n = grid.length ;
        int m = grid[0].length ;

        for(int i = 0 ; i < 201 ; i++){
            for(int j = 0 ; j < 201 ; j++)
            dp[i][j] = -1 ;
        }
        return solve(grid,n-1,m-1);
    }

    int solve(int[][] a , int n , int m){

        if(n == 0 && m == 0) return a[n][m] ;
        if(n < 0 || m < 0) return 100000 ; // return max value when out of matrix

        if(dp[n][m] != -1) return dp[n][m] ;
        return dp[n][m] = a[n][m] + Math.min(solve(a,n-1,m),solve(a,n,m-1));
    }
}
