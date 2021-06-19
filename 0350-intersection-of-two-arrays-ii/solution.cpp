class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        const int n = nums1.size();
        const int m = nums2.size();
        
        vector<int> res ;
        unordered_map<int,int> ump ; 
        
        for(auto &i : nums1) ump[i]++;
        
        for(auto &i: nums2){
            if(ump[i] > 0){ump[i]--; res.push_back(i);}
        }
        
        return res ;
    }
};
