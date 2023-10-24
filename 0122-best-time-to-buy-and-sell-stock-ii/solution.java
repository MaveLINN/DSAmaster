class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length ;
        int res = 0 ; 
        int check = prices[n-1];

        for(int i = 1 ; i < n ; i++){
            if((prices[i] - prices[i-1]) > 0 ) res += (prices[i] - prices[i-1]);
        }
        return res ;
    }
}
