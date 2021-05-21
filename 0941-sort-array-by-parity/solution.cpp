class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        const int n = nums.size();
        vector<int> v(n,-1) ;
        
        int k = 0 ;
        for(auto i : nums){
            if(i%2){
                v.push_back(i);
            }else v[k++] = i ;
        }
        nums.clear();
        for(auto i : v){
            if(i != -1)nums.push_back(i);
        }
        
        
        return nums ;
    }
};
