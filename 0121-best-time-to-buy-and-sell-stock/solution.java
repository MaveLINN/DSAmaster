class Solution {
    public int maxProfit(int[] prices) {
        int res = 0 , rightMax = -1;

        List<Integer> list = new ArrayList<>();
        list.add(-1);
        for(int i = prices.length - 2 ; i>= 0 ; i--){
            rightMax = Math.max(rightMax,prices[i+1]); // finding max in right side excluding current value
            res = Math.max(rightMax-prices[i] , res);  // FINDING max result on spot and looping on . 
        }
        return res ;
    }
}




