class Solution {
    int[][] dp ;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        dp = new int[n][n+1];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n + 1 ; j++){
                dp[i][j] = -1 ;
            }
        }
        return solve(nums,0,-1);
    }

    int solve(int[] nums , int idx , int prevIdx){
        if(idx >= nums.length ) return 0 ;
        if(dp[idx][prevIdx + 1] != -1) return dp[idx][prevIdx + 1];
        int x = 0 , xx = 0 ;

        xx = solve(nums,idx+1, prevIdx);

        if(prevIdx == -1 || nums[idx] > nums[prevIdx]){
            x = 1 + solve(nums,idx+1,idx);
        }
       
        return dp[idx][prevIdx + 1] = Math.max(x,xx);
    }
}
