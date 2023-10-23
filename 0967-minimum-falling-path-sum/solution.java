class Solution {
    int[][] dp = new int[101][101] ;
    public int minFallingPathSum(int[][] matrix) {

        for(int i  = 0 ; i < 101 ; i++){
            for(int j = 0 ; j < 101 ; j++){
                dp[i][j] = -Integer.MAX_VALUE ;
            }
        }

        int n = matrix.length ;
        int res = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i++){
            res = Math.min(res,solve(matrix,n-1,0,i));
        }
        return res ;
    }

    public int solve(int[][] a , int n , int i , int j){
        if(j < 0 || j > n) return Integer.MAX_VALUE ;
        if(i > n ) return 0 ;

        if(dp[i][j] != -Integer.MAX_VALUE ) return dp[i][j] ;
        return dp[i][j] = a[i][j] + Math.min(solve(a,n,i+1,j-1) , Math.min(solve(a,n,i+1,j),solve(a,n,i+1,j+1))) ;

    }
}
