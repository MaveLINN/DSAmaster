class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int res = -INT_MAX , x = 0 , xx = 0 ; 
        for( auto i : nums ){
            x = max( i , x  + i);
            res = max( res , x);
        }
        return res ; 
        
    }
};
