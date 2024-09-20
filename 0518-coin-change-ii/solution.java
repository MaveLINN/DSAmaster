class Solution {
    int[][] dp = new int[5005][303];
    public int change(int amount, int[] coins) {
        int n = coins.length;
        for(int i = 0 ; i < 5005 ; i++){
            for(int j = 0 ; j < 303 ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(coins,amount,0,n-1);
    }

    public int solve(int[] a,int target,int idx,int size){
        if(target == 0) return 1;
        if(target < 0 || idx > size) return 0;

        if(dp[target][idx] != -1 ) return dp[target][idx];
        return dp[target][idx] = solve(a,target - a[idx],idx,size) + solve(a,target,idx+1,size);
    }
}
