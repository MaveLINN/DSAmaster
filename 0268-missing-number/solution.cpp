class Solution {
public:
    int missingNumber(vector<int>& nums) {
        const int n = nums.size();
        
        int res = 0 ; 
        for(auto i : nums)res += i ;
        
        return (n*(n+1)/2) - res ;
    }
};
