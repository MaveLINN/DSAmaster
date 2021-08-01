class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        const int n = nums.size();
        unordered_map<int,int> mp ;
        for(auto &i : nums ){
            mp[i]++;
        }
        
        for(auto &i : mp){
            if(i.second == n/2) return i.first ;
        }
        
        return 0 ;
    }
};
