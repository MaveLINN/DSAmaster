class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        const int n = nums.size();
        
        int gg = *max_element(nums.begin() , nums.end());
        int has[gg+1] , pre[gg+1];
        
        memset(has , 0 , sizeof has);
        memset(pre , 0 , sizeof pre);
        
        for(auto i : nums){
            has[i]++;
        }
        int sum = 0 ;
        for(int i = 0 ; i < gg+1 ; i++){
            
            if(has[i]){
                pre[i] = sum ;
                sum += has[i] ;
            }
            
        }
        vector<int > v ;
        
        for(int i = 0 ; i < n; i++){
            v.push_back(pre[nums[i]]);
        }
        
        return v ;
    }
};
