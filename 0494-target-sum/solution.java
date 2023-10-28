class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0,nums.length);
    }

    public int solve(int[] a,int target,int sum ,int i , int n ){
        if(target == sum && i == n ) return 1 ;
        if(i >= n ) return 0 ;
        return solve(a,target , sum + a[i] , i+1 , n) + solve(a,target , sum - a[i] , i+1 , n) ;
    }
}
