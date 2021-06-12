class Solution {
public:
    int maxProfit(vector<int>& prices) {
        const int n = prices.size();
        int res = 0 ; 
        
        int check = 0;
        for(int i = n - 2 ; i >= 0 ; i-- ){
            check = max(check , prices[i+1]);
            res = max(res , check - prices[i]);
        }
        
        return res ; 
    }
};
