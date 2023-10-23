class Solution {
    int[][] dp = new int[201][201] ;
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int i = 0 ; i < 201 ; i++){
            for(int j = 0 ; j < 201 ; j++) dp[i][j] = -1 ;
        }
        return solve(triangle,n,0,0);
    }

    int solve(List<List<Integer>> a , int n , int i , int j){
        if(i == n ) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = a.get(i).get(j) + Math.min(solve(a,n,i+1,j),solve(a,n,i+1,j+1));
    }
}
