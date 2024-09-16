class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length , sum = 0, res = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
           sum = Math.max(nums[i],nums[i]+sum);
           res = Math.max(res,sum);
        }
        return res;
    }

}
