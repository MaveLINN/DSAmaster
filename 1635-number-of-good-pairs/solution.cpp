class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        map<int,int> mp ; 
        for(auto &i : nums){
            mp[i]++;
        }
        int res = 0 ; 
        for(auto &i : mp){
            int n = i.second ;
            res += n*(n-1)/2;
        }
    
    return res ;
    }
};
