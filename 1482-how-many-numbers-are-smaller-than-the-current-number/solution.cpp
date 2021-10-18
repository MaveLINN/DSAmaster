class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        map<int,int> mp; 
        for(auto i : nums){
            mp[i]++;
        }
        
        int prev = 0 ;
        for(auto &i : mp){
            int n = i.second ;
            i.second = prev ;
            prev += n ;
        }
        
        vector<int> res ;
        for(auto i : nums){
            res.push_back(mp[i]);
        }
        
        return res ;
    }
};
