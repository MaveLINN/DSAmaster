class Solution {
    int[] dp ;
    public int rob(int[] nums) {
        dp = new int[101];
        for(int i = 0 ; i < 101 ; i++) dp[i] = -1 ;
        return solve(nums,0);
    }

    public int solve(int[] nums , int idx){
        if(idx >= nums.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = Math.max( nums[idx] + solve(nums,idx + 2) , solve(nums,idx + 1));
    }
}
