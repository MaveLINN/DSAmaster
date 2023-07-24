class Solution {

    int[] dp = new int[107];

    public int rob(int[] nums) {
       for(int i = 0 ; i < 107 ; i++) dp[i] = -1 ; 
       int n = nums.length; 
       return solve(nums,n-1); 
    }

    public int solve(int[] nums , int idx ){

        if(idx < 0) return 0 ;
        if(dp[idx] != -1) return dp[idx];

        int x = nums[idx] + solve(nums , idx - 2 );
        int y = solve(nums , idx - 1) ;

        return dp[idx] = Math.max(x,y);
    }
}

