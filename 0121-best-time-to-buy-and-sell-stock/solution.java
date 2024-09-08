class Solution {
    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int maxi = prices[n-1] , res = 0 ;
        for(int i = n-1 ; i >= 0 ; i--){
            maxi = Math.max(maxi,prices[i]);  // finding max in right side excluding current value
            res = Math.max(res,maxi - prices[i]); // FINDING max result on spot and looping on . 
        }
        return res ;
    }
}
