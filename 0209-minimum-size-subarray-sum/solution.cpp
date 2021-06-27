class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        const int n = nums.size();
        int res = INT_MAX ;
        int l = 0 , sum = 0 ; 
        
        for(int i = 0 ; i < n ; i++){
            sum+= nums[i];
            while(sum >= target){
                res = min(res , i - l + 1);
                sum -= nums[l++];
            }
        }
        return res != INT_MAX ? res : 0 ;
    }
};
