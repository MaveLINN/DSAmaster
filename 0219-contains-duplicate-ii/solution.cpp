class Solution {
public:
    struct Node{
        int value = -1 ;
    };
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        const int n = nums.size();
        unordered_map<int,Node>mp;
        
        for(int i = 0 ; i < n ;i++){
            if(mp[nums[i]].value > -1){
                if(abs(mp[nums[i]].value - i) <= k)
                    return true;
            }
            
         mp[nums[i]].value = i ;
        }
        return false ;
    }
};
