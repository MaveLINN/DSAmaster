class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mp ;
        int n = nums.size();
        vector<int> v ;
        for(int i = 0 ; i < n ; i++){
            if(mp[target - nums[i]] > 0 ){
                v.push_back(i);
                v.push_back(mp[target - nums[i]] - 1);
            }
            mp[nums[i]] = i + 1;
        }
        return v ;
    }
};
