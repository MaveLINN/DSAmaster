class Solution {
public:
    vector<int> getSumAbsoluteDifferences(vector<int>& nums) {
        const int n = nums.size() ;
        int ans = 0 ;
        
        for(int i = 0 ; i < n ; i++) ans += nums[i];
        
        vector<int> res ;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            int val = (ans - sum) - nums[i]*(n-i) + (nums[i]*i-sum);
            res.push_back(val);
            sum+=nums[i];
        }
        
        return res ;
    }
};
