class Solution {
public:
    int arraySign(vector<int>& nums) {
        const int n = nums.size();
        
        int res = 1 , ct = 0 ;
        for(auto i : nums){
            if(i == 0)return 0 ;
            res *= i < 0 ? -1 : 1;
        }
        
        return res;
    }
};
