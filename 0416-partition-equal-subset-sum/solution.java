class Solution {
    private Boolean[][] dp ;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++) sum += nums[i];
        
        dp = new Boolean[n][(sum/2) + 1];
        if(sum % 2 != 0) return false ;
        return solve(nums,n,0,sum/2);
    }
    
    public boolean solve(int[] a , int n , int idx , int sum ){
        
        if(idx >= n || sum < 0) return false;
        if(sum == 0 ) return true ;
        if(dp[idx][sum] != null) return dp[idx][sum] ;
        return dp[idx][sum] = solve(a,n,idx+1,sum-a[idx]) || solve(a,n,idx+1,sum);
    }
}
