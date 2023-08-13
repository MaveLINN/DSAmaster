class Solution {
    int[][] dp = new int[101][101];
    public int uniquePaths(int m, int n) {
        for(int i = 0 ; i < 101 ; i++){
            for(int j = 0 ; j < 101 ; j++){
                dp[i][j] = -1 ;
            }
        }
        return solve(0,0,m-1,n-1);
    }

    public int solve(int i , int j , int m , int n){
        if(i == m && j == n) return 1 ;
        if(i > m || j > n ) return 0 ;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = solve(i+1,j,m,n) + solve(i,j+1,m,n);
    }

}
