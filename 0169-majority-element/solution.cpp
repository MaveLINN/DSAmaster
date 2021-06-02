class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(auto i : nums)mp[i]++;
        
        int res = 0 , ans = 0 ;
        for(auto i : mp){
            if(i.second > ans){
                ans = i.second ;
                res = i.first;
            }
        }
        
        return res ;
    }
};
