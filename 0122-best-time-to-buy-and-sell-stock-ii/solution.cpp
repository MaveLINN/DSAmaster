class Solution {
public:
    int maxProfit(vector<int>& v) {
        int res = 0 , n = v.size(); 
        for( int i = 1 ; i < n ; i++){
            if(v[i] - v[i-1] > 0)res += v[i] - v[i-1] ;
        }
        return res ;
    }
};
