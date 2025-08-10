class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;
        int mx = prices[n-1];

        int res = 0 ;
        for(int i = n - 2 ; i >= 0 ; i--){
            res = Math.max(res, mx - prices[i]);
            mx = Math.max(mx,prices[i]);
        }

        return res ;
    }
}
