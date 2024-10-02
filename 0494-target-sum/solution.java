class Solution {
    private static Integer[] dp;
    public static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        dp = new Integer[n];
        for(int i = 0 ; i < n ; i++){
            dp[i] = Integer.MIN_VALUE;
        }
        return solve(nums,0,target,0);
    }

    public static int solve(int[] a, int idx , int target,int sum) {

        if(target == sum && idx == a.length) return 1;
        if (idx >= a.length) return 0 ;
        return dp[idx] = solve(a,idx+1,target,sum - a[idx]) + solve(a,idx+1,target,sum + a[idx]);
    }
}
