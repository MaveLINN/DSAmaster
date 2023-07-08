class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length ;

        int sum = 0 ;
        for(int i = 0 ; i < k - 1 ; i++) sum += nums[i] ;

        double res = -Integer.MAX_VALUE ;
        for(int i = k - 1 ; i < n ; i++){
            sum += nums[i];
            res = (double)Math.max(res,(double)sum/k);
            sum -= nums[i+1-k] ;
        }

        return res ;
    }
}
